import java.util.ArrayList;
import java.util.Random;

public class BogoTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int x = 0; x < 3; x++) {
            int use = rand.nextInt(50);
            list.add(use);
        }
        System.out.println(list);
        BogoSort.sort(list);
    }
}