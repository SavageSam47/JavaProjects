import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class robot {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		// TODO Auto-generated method stub

		Desktop.getDesktop().open(new File("/Applications/TextEdit.app"));
		Robot r = new Robot();
		r.mouseMove(400, 500);
		Thread.sleep(15);
		r.mouseMove(400, 300);
		
		r.mouseMove(400, 500);
		/**r.keyPress(KeyEvent.VK_H);
		Thread.sleep(15);
		r.keyPress(KeyEvent.VK_E);
		Thread.sleep(15);
		r.keyPress(KeyEvent.VK_L);
		Thread.sleep(15);
		r.keyPress(KeyEvent.VK_L);
		Thread.sleep(15);
		r.keyPress(KeyEvent.VK_O);**/
		
		
		
		r.keyPress(KeyEvent.VK_L);
		Thread.sleep(15);
		r.keyRelease(KeyEvent.VK_L);		Thread.sleep(15);


	}

}
