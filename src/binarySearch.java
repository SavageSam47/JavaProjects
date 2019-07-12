import java.util.ArrayList;
public class binarySearch{
    public  binarySearch(){

    }
    // base exponent result
    // 2    7        127
    // a  ^ b        ?
    // ?    a  sqrt  b
    // 3    2        9
    // 2    ?        1000
    // log2(1000) ~= 10
    // log2(1024) = 10
    // 

    // O(log n)
    public static int input(ArrayList<Integer> list, int find){
        int high = list.size();
        int low = 0;
        while (true){
            if(low==high){
                return -1;
            }
            else if(find>list.get((low+high)/2)){
                low = (low+high)/2+1;
                System.out.println("greater");
            }
            else if(find<list.get((low+high)/2)){
                high = (low+high)/2;
                System.out.println("less");
            }
            else if(find==list.get((low+high)/2)){
                return (low+high)/2;
            }
            

        }
    }
}