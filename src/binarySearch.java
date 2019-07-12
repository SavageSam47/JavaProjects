import java.util.ArrayList;
public class binarySearch{
    public  binarySearch(){

    }
    public static int input(ArrayList<Integer> list, int find){
        int high = list.size();
        int low = 0;
        while (true){
            if(find>list.get((low+high)/2) && low==0){
                low = (low+high)/2;
                System.out.println("greater");
            }
            else if(find>list.get((low+high)/2)){
                low = (low+high)/2;
                System.out.println("greater2");
            }
            else if(find<list.get((low+high)/2)){
                high = (low+high)/2;
                System.out.println("less");
            }
            else{
                if(find==list.get(high-1) && find==list.get(low+1)){
                    return list.get(high-1);
                }
            }
        }
    }
}