import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class autominer {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		Robot r = new Robot();

		JFrame f = new JFrame();
		f.getContentPane().add(new completekey());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);

		r.setAutoDelay(40);
		r.setAutoWaitForIdle(true);
		r.delay(9000);
		angle();
		layer();
		down();
		twodown();
		angle();
		layer();

	}

	public static void startangle() throws AWTException {
		Robot r = new Robot();
		type("/tp S83 ");
		type("50 ");
		for (int x = 0; x < 2; x++) {
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_BACK_QUOTE);
			r.keyRelease(KeyEvent.VK_BACK_QUOTE);
			r.keyRelease(KeyEvent.VK_SHIFT);
			type(" ");
		}
		type("0");
		type(" ");

		type("4");
		type("8");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void layer() throws AWTException, InterruptedException {
		for (int yr = 0; yr < 5; yr++) {
			if (yr < 4) {
				mine();
				turnright();
				twoblock();
				turnright();
				mine();
				turnleft();
				twoblock();
				turnleft();
			} else {
				mine();
			}

		}
		turnright();
		twoblock();
		turnright();
		mine();
	}

	public static void down() throws AWTException {
		Robot r = new Robot();
		type("/tp S83 ");
		for (int x = 0; x < 3; x++) {
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_BACK_QUOTE);
			r.keyRelease(KeyEvent.VK_BACK_QUOTE);
			r.keyRelease(KeyEvent.VK_SHIFT);
			type(" ");
		}
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_SHIFT);
		type(" ");

		type("90");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		turnright();
	}

	public static void angle() throws AWTException {
		Robot r = new Robot();
		type("/tp S83 ");
		for (int x = 0; x < 3; x++) {
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_BACK_QUOTE);
			r.keyRelease(KeyEvent.VK_BACK_QUOTE);
			r.keyRelease(KeyEvent.VK_SHIFT);
			type(" ");
		}
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_SHIFT);
		type(" ");

		type("4");
		type("8");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void twodown() throws AWTException, InterruptedException {
		Robot r = new Robot();

		Thread.sleep(150);

		r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(150);
		r.mouseRelease(InputEvent.BUTTON1_MASK);

		Thread.sleep(150);

		r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(150);
		r.mouseRelease(InputEvent.BUTTON1_MASK);

	}

	public static void twoblock() throws AWTException, InterruptedException {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(100);
		r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(150);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(60);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(60);
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(100);
		r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(150);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(60);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(60);

	}

	public static void mine() throws AWTException, InterruptedException {
		Robot r = new Robot();
		for (int t = 0; t < 10; t++) {
			r.keyPress(KeyEvent.VK_W);
			r.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(350);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(45);
			r.keyRelease(KeyEvent.VK_W);

		}
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(45);
		r.keyRelease(KeyEvent.VK_W);
	}

	public static void turnright() throws AWTException {
		Robot r = new Robot();
		type("/tp S83 ");
		for (int x = 0; x < 3; x++) {
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_BACK_QUOTE);
			r.keyRelease(KeyEvent.VK_BACK_QUOTE);
			r.keyRelease(KeyEvent.VK_SHIFT);
			type(" ");
		}
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_SHIFT);
		type("90 ");
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void turnleft() throws AWTException {
		Robot r = new Robot();
		type("/tp S83 ");
		for (int x = 0; x < 3; x++) {
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_BACK_QUOTE);
			r.keyRelease(KeyEvent.VK_BACK_QUOTE);
			r.keyRelease(KeyEvent.VK_SHIFT);
			type(" ");
		}
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_SHIFT);
		type("270 ");
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void type(String s) throws AWTException {
		Robot rr = new Robot();

		byte[] bytes = s.getBytes();
		for (byte b : bytes) {
			int code = b;
			if (code > 96 && code < 123)
				code = code - 32;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rr.keyPress(code);
			rr.keyRelease(code);
		}
	}

}
