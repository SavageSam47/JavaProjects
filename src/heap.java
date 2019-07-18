import java.util.ArrayList;
import java.util.Collections;

public class heap {
    private ArrayList<Integer> list;

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

    public static ArrayList<Integer> heapSort(ArrayList<Integer> toSort) {
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        heap heap = new heap(toSort);
        int initalSize = toSort.size();
        for (int x = 0; x < initalSize; x++) {
            sorted.add(heap.removeHead());
        }
        return sorted;
    }

    private void heapifyDownward(int index) {
        boolean t = true;
        if (index * 2 + 1 >= list.size()) {
            return;
        } else {
            while (t == true) {
                if (index * 2 + 1 >= list.size() - 1) {
                    return;
                } else if (list.get(index) < list.get(index * 2 + 1) && list.get(index) < list.get(index * 2 + 2)) {
                    t = false;
                    return;
                } else {
                    if (list.get(index * 2 + 1) > list.get(index * 2 + 2)) {
                        Collections.swap(list, index, index * 2 + 2);
                        index = index * 2 + 2;

                    } else if (list.get(index * 2 + 1) < list.get(index * 2 + 2)) {
                        Collections.swap(list, index, index * 2 + 1);
                        index = index * 2 + 1;

                    }

                }
            }
        }
    }

    public heap() {
        list = new ArrayList<Integer>();
    }

    public heap(ArrayList<Integer> listInput) {
        list = listInput;
        for (int x = 0; x < list.size() - 1; x++) {
            heapify(x);
        }
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
        Collections.swap(list, 0, list.size() - 1);
        list.remove(list.size() - 1);
        heapifyDownward(0);
        return newHead;
    }

    public int remove(int index) {
        int newHead = list.get(index);
        list.add(Integer.MIN_VALUE);
        Collections.swap(list, index, list.size() - 1);
        list.remove(list.size() - 1);
        heapify(index);
        removeHead();
        // // Collections.swap(list, index, list.size() - 1);
        // // list.remove(list.size() - 1);
        // // heapifyDownward(0);
        return newHead;
    }

    public void print() {
        System.out.println(list);
    }
}