import javax.swing.*;
import java.awt.*;

public class Happy {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("T");
        for (int i = 0; i < 1280; i+=200) {
            for (int j = 0; j < 800; j+=20) {
                createWindow(i, j, new JFrame("" + i+j));
            }
        }

        //createChild(250, 900, frame);

    }

    public static void createWindow(int x, int y, JFrame frame) {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,1);
        frame.setLocation(x, y);
        frame.setVisible(true);
    }

    public static void createChild(int x, int y, JFrame frame) {
        JDialog d = new JDialog(frame);
        d.add(Box.createRigidArea(new Dimension(200, 200)));
        d.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        d.setLocationByPlatform(true);
        d.setLocation(x, y);
        d.pack();
        d.setVisible(true);

    }
}