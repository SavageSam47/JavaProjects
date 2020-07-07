import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void bubbleSort(int[] list){
        int numElements = list.length;
        for(int i = 0;i < numElements - 1; i++){
            for(int j = numElements - 1; j != i; j--){
                if(list[j] < list[j-1]){
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
    }

    public static void bubbleSort(ArrayList<Double> list){
        for(int x = 0; x < list.size();x++){
            for (int i = 0; i < list.size()-1; i++) {
                if(list.get(i) > list.get(i+1)){
                    list.add(i, list.get(i+1));
                    list.remove(i+2);
                    // 1 2 3 q
                }
            }
        }
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> old){
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        while (old.size() > 0) {
            int toAdd = old.remove(0);
            int index = 0;
            while(index < sorted.size() && sorted.get(index) < toAdd){
                index++;
            }
            sorted.add(index, toAdd);
        }
        return sorted;
    }

    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(5.6);
        arr.add(2.2);
        arr.add(7.3);
        arr.add(10.8);
        arr.add(3.4);
        arr.add(9.1);
        arr.add(8.0);
        bubbleSort(arr);
        System.out.println(arr);



    }
}
