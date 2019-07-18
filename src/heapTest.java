public class heapTest {
    public static void main(String[] args) {
        heap heab = new heap();
        for (int x = 1; x < 11; x++) {
            heab.add(x);
        }
        heab.add(0);
        heab.removeHead();
        heab.print();
    }
}