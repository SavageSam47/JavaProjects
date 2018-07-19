
public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 2000;
		System.out.println(recursion(x));
	}

	
	
	public static int recursion(int number) {
		if(number==1) {
			return 1;
		}
		else {
			return recursion (number-1)+number;
		}
	}
}
