import java.util.ArrayList;
public class binarySearchTest{
    public static void main(String[] args){
        binarySearch s = new binarySearch();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int x=0;x<1000;x++){
            list.add(x);
            System.out.println(x);
        }
        
        binarySearch.input(list, 700);
    }
}