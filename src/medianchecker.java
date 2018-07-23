import java.util.ArrayList;
import java.util.Scanner;
public class medianchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> array= new ArrayList<Integer>();
		boolean finished = false;
		while (finished == false) {
			System.out.println("Enter a Value, type done when you are done");
			String input = scan.next();
			if(input.equalsIgnoreCase("done")) {
				break;
			}
			else {
				int input2 = Integer.parseInt(input);
				array.add(input2);
			}
		}
		arraychecker(array);
		printarray(array);
		int median1 = array.size()%2;
		if(median1==1) {
			int median2 = array.size() - (array.size()/2);
			System.out.println();
			System.out.println(array.get(median2 - 1));
		}
		else if(median1==0) {
			int median2 = array.size() - (array.size()/2);
			double middle = array.get(median2 -1);
			double middle2 = array.get(median2 );
			double answer = ((middle+middle2)/2);
			System.out.println();
			System.out.println(answer);
		}


	}
	public static ArrayList<Integer> printarray(ArrayList<Integer> array) {
		System.out.print(array);
		return array;
	}
	public static ArrayList<Integer> arraychecker(ArrayList<Integer> array) {
		for (int y = 0; y<array.size(); y++) {
			for(int x = 0; x<array.size()-1; x++) {
				if(array.get(x)>array.get(x+1)) {
					int a = array.get(x);
					int b = array.get(x+1);
					array.set(x, b);
					array.set(x+1, a);
				}
			}
		}
		return array;
	}
}