public class Beep {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            Thread.sleep(25);
        }

    }
}