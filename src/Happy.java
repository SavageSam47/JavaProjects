import javax.swing.*;
import java.awt.*;

public class Happy {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello mam");
        createWindow(900, 500, frame);
        createChild(250, 900, frame);

    }

    public static void createWindow(int x, int y, JFrame frame) {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(x, y);
        frame.pack();
        frame.setVisible(true);
        while (true) {

        }
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