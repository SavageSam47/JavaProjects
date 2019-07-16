import java.util.ArrayList;

public class hashMap {
    public ArrayList<Integer> keys;
    public ArrayList<Integer> values;
    private int size;

    public hashMap() {
        values = new ArrayList<Integer>();
        keys = new ArrayList<Integer>();
        values.ensureCapacity(30);
        size = 30;
        for (int x = 0; x < size; x++) {
            values.add(0);
        }
    }

    public int hash(int value) {
        int key = (int) ((value / size) * Math.sqrt(size));
        keys.add(key);
        System.out.println(key);
        values.add(key, value);
        return key;
    }

    public int remove(int key) {
        int value = values.get(key);
        values.remove(key);
        Integer key1 = key;
        keys.remove(key1);
        return value;
    }

    public int get(int key) {
        return values.get(key);
    }
}