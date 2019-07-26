import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BogoSort {
    public BogoSort() {

    }

    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
        boolean sorted = false;
        while (sorted == false) {
            Collections.shuffle(list);
            isCollectionSorted(list);
            System.out.println(list);
        }
        return list;
    }

    public static boolean isSorted() {

    }
}