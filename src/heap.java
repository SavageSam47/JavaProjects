import java.util.ArrayList;
import java.util.Collections;

public class heap {
    ArrayList<Integer> list;

    public heap() {
        list = new ArrayList<Integer>();
        list.add(-1);
    }

    public void add(int value) {
        list.add(value);
        while (true) {
            if (value < list.get(list.indexOf(value) / 2)) {

                int tempparent = list.get(list.indexOf(value) / 2);
                /*
                 * list.set(list.indexOf(value) / 2, value); list.set(list.indexOf(value),
                 * tempparent);
                 */
                Collections.swap(list, tempparent, list.indexOf(value));

            } else {
                break;
            }
        }
    }

    public void remove(int value) {
        int temp = list.indexOf(value);
        int replacewith = list.get(list.size() - 1);
        list.set(list.indexOf(value), list.get(list.size()) - 1);
        list.remove(list.size() - 1);
        while (true) {
            if (list.indexOf(replacewith) * 2 > list.size()) {
                break;
            } else {
                if (list.get(temp) > list.get(list.indexOf(replacewith) * 2)) {

                }
                if (list.get(temp) > list.get(list.indexOf(replacewith) * 2)) {

                }
            }
        }
        // if(list.get(temp)>list.get(temp+1) || list.get(temp)>list.get(temp+2)){

        // }
    }

    public void print() {
        for (int x = 1; x < list.size(); x++) {
            System.out.println(list.get(x));
        }
    }
}