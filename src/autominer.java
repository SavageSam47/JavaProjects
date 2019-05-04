import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class autominer {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		Robot r = new Robot();

		r.setAutoDelay(40);
		r.setAutoWaitForIdle(true);
		r.delay(9000);
		/**PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();
		System.out.println(y);
		Thread.sleep(10);
		r.mouseMove(x + 3000, y);
		Thread.sleep(10);**/
		/*
		b = a.getLocation();
		 x = (int) b.getX();
		 y = (int) b.getY();
		 Thread.sleep(10);
		r.mouseMove(x, y +1);
		 */
		// ~ ~ ~ ~90 ~
		for (int u = 0;u<2;u++){
		for (int t = 0;t<10;t++){
			r.keyPress(KeyEvent.VK_W);
			r.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(350);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(30);
			r.keyRelease(KeyEvent.VK_W);
			
		}
		turn();
		r.keyPress(KeyEvent.VK_W);
		r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(60);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(60);

		r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(60);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
		r.keyRelease(KeyEvent.VK_W);
		turn();
		}

	}
	public static void turn() throws AWTException{
		Robot r = new Robot();
		type("/tp S83 ");
		for (int x=0;x<3;x++){
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
	public static void type(String s) throws AWTException{
		Robot rr = new Robot();

		byte[] bytes = s.getBytes();
		for(byte b : bytes){
			int code = b;
			if (code > 96 && code <123) code = code - 32;
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
