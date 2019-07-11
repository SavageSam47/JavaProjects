import java.util.ArrayList;
public class binarySearch{
    public  binarySearch(){

    }
    public static int input(ArrayList<Integer> list, int find){
        int high = list.size();
        int low = 0;
        while (true){
            if(find>list.get(high/2)){
                low = high/2;
            }
            else if(find<list.get(high/2)){
                high = high/2;
            }
            else{
                if(find==list.get(high-1) && find==list.get(low+1)){
                    return list.get(high-1);
                }
            }
        }
    }
}