import java.util.ArrayList;
import java.util.Scanner;
public class lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names= new ArrayList<String>();
		boolean finished = false;
		Scanner scan = new Scanner(System.in);
		while(finished==false) {
			String c= scan.next();
			if(c.equalsIgnoreCase("done")) {
				break;
			}
			else {
				names.add(c);
			}
		}
		System.out.print(names);

	}

}
