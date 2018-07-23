import java.util.ArrayList;
import java.util.Scanner;
public class meanchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		boolean finished= false;
		while (finished == false) {
			System.out.println("Enter a Value, type done when you are done");
			String input = scan.next();
			if(input.equalsIgnoreCase("done")) {
				break;
			}
			else {
				int input2 = Integer.parseInt(input);
				numbers.add(input2);
			}
		}
		double total = 0;
		for(int a = 0; a<numbers.size(); a++) {
			total=total + numbers.get(a);
		}
		System.out.println("Mean: " + (total/numbers.size()));
	}

}
