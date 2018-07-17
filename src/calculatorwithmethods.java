import java.util.Scanner;
public class calculatorwithmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter the operation you would like to use:");
		String operation = scan.next();
		System.out.println("Enter your second number:");
		int num2 = scan.nextInt();
		if (operation.equalsIgnoreCase("addition")) {
			System.out.println("Answer: " + addition(num1, num2));
		}
		if (operation.equalsIgnoreCase("subtraction")) {
			System.out.println("Answer: " + subtraction(num1, num2));
		}
		if (operation.equalsIgnoreCase("multiplication")) {
			System.out.println("Answer: " + multiplication(num1, num2));
		}
		if (operation.equalsIgnoreCase("division")) {
			System.out.println("Answer: " + division(num1, num2));
		}
	}
	public static int  addition(int a, int b) {
		int c =a+b;
		return c;
	}
	public static int multiplication(int a, int b) {
		int c=a*b;
	    return c;
	}
	public static int division(int a, int b) {
		int c=a/b;
		return c;
	}
	public static int subtraction(int a, int b) {
		int c=a-b;
		return c;
	}
}
