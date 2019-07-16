import java.util.ArrayList;

public class hashMapTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int x = 0; x < 30; x++) {
            list.add(0);
        }
        System.out.println(list);
        list.add(5, 30);
        System.out.println(list);
        /*
         * hashMap map = new hashMap(); int key = map.hash(33);
         * System.out.println(map.get(key));
         */
    }
}