import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.awt.event.ActionEvent;

public class jswing extends JFrame {
	private final JButton b = new JButton();

	public jswing() {
		super();
		this.setTitle("HelloApp");
		this.getContentPane().setLayout(null);
		this.setBounds(100, 100, 300, 140);
		this.add(makeButton());
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private JButton makeButton() {
		b.setText("Click me for the truth!!!");
		b.setBounds(40, 40, 200, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b, "");
			}
		});
		return b;
	}

	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		// Swing calls must be run by the event dispatching thread.
		SwingUtilities.invokeAndWait(() -> new jswing());
	}
}