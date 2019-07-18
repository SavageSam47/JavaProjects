import java.util.ArrayList;
import java.util.Collections;

public class heap {
    ArrayList<Integer> list;

    private void heapify(int index) {
        boolean t = true;
        // getting parent, (index-1)/2
        // getting child, 2n+1
        if (index == 0) {
            return;
        } else {
            while (t == true) {
                if (index == 0) {
                    t = false;
                } else if (list.get(index) < list.get((index - 1) / 2)) {
                    Collections.swap(list, index, (index - 1) / 2);
                    index = (index - 1) / 2;
                } else {
                    t = false;
                }
            }
        }
    }

    private void heapifyDownward(int index) {
        boolean t = true;
        if (index * 2 + 1 > list.size()) {
            return;
        } else {
            while (t == true) {
                if (list.get(index) < list.get(index * 2 + 1) && list.get(index) < list.get(index * 2 + 2)) {
                    t = false;
                    return;
                } else {
                    if (list.get(index * 2 + 1) > list.get(index * 2 + 2)) {
                        Collections.swap(list, index, index * 2 + 2);
                        index = index * 2 + 2;
                        t = false;
                    } else if (list.get(index * 2 + 1) < list.get(index * 2 + 2)) {
                        Collections.swap(list, index, index * 2 + 1);
                        index = index * 2 + 1;
                        t = false;
                    }
                }
            }
        }
    }

    public heap() {
        list = new ArrayList<Integer>();
    }

    public void add(int value) {
        list.add(value);
        if (list.size() < 2) {
            return;
        } else {
            heapify(list.size() - 1);
        }
    }

    public int removeHead() {
        int newHead = list.get(0);
        Collections.swap(list, 0, list.size()-1);
        list.remove(list.size() - 1);
        heapifyDownward(0);
        return newHead;
    }

    public void remove(int value) {
        int temp = list.indexOf(value);
        int replacewith = list.get(list.size() - 1);
        list.set(list.indexOf(value), list.get(list.size() - 1));
        list.remove(list.size() - 1);
        while (true) {
            if (list.indexOf(replacewith) * 2 > list.size()) {
                break;
            } else {
                if (list.get(list.indexOf(replacewith) * 2 - 1) > list.get(list.indexOf(replacewith) * 2)) {
                    temp = list.indexOf(replacewith) * 2;
                } else if (list.get(list.indexOf(replacewith) * 2 + 1) < list.get(list.indexOf(replacewith) * 2)) {
                    temp = list.indexOf(replacewith) * 2 + 1;
                }

                Collections.swap(list, temp, list.indexOf(replacewith) - 1);
            }
        }
    }

    public void print() {
        System.out.println(list);
    }
}