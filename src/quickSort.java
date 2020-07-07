import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class quickSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            arr.add(rand.nextInt(100));
        }
        System.out.println(arr);
        sort(arr, 0, arr.size()-1);
        System.out.println(arr);
    }


    public static void sort(ArrayList<Integer> list, int low, int high) {
        if(low<high){
            int pi = partition(list, low, high);

            sort(list, low, pi-1);
            sort(list, pi + 1, high);
        }
    }

    public static int partition(ArrayList<Integer> list, int low, int high){
        int pivot = list.get(high);
        int i = (low-1);
        for (int j = low; j <= high-1 ; j++) {
            if(list.get(j) < pivot){
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i+1, high);
        return (i+1);
    }
    
}