import java.util.ArrayList;

public class quickSort {
    ArrayList<Integer> result = new ArrayList<Integer>();

    public quickSort() {

    }

    public ArrayList<Integer> sort(ArrayList<Integer> list) {
        ArrayList<Integer> right = new ArrayList<Integer>();
        ArrayList<Integer> left = new ArrayList<Integer>();
        if (list.size() == 1) {
            return result;
        } else {
            int pivot = list.get(list.size() - 1);
            for (int x = 0; x < list.size() - 1; x++) {
                if (list.get(x) > pivot) {
                    right.add(list.get(x));
                    list.remove(x);

                }
                if (list.get(x) < pivot) {
                    left.add(list.get(x));
                    list.remove(x);

                }

            }
            sort(left);
            sort(right);
            // result.addAll(left + pivot + right);

        }
        return result;
    }
}