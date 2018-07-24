

public class addingwithrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(5,5));
	}
	public static int add(int num1, int num2) {
		if(num2==1) {
			return 1;
		}
		else {
			return num1+ add(num1,num2-1);
		}

	}
}
