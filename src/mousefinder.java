import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class mousefinder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();
		System.out.println(y);
	}

}
