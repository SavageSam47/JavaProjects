import java.util.ArrayList;
public class binarySearchTest{
    public static void main(String[] args){
        binarySearch s = new binarySearch();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int x=1;x<1000;x*=3){
            list.add(x);
            System.out.println(x);
        }
        
        
        System.out.println(binarySearch.input(list, 9));
        //System.out.println(binarySearch.input(list, 99));
        //System.out.println(binarySearch.input(list, 50));
    }
}