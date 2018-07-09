import java.util.Scanner;
public class Calculatorwithloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loop = 0;
				while (loop == 0) {
					Scanner scan = new Scanner(System.in);
					System.out.println("Enter your first number:");
					int num1 = scan.nextInt();
					System.out.println("Enter the operation you would like to use:");
					String operation = scan.next();
					System.out.println("Enter your second number:");
					int num2 = scan.nextInt();
					if (operation.equalsIgnoreCase("addition")) {System.out.println("Answer: " + (num1+num2));}
					else if (operation.equalsIgnoreCase("division")) {System.out.println("Answer: " + (num1/num2));}
					else if (operation.equalsIgnoreCase("subtraction")) {System.out.println("Answer: "+ (num1-num2));}
					else if (operation.equalsIgnoreCase("multiplication")) {System.out.println("Answer: " + (num1*num2));}
					else {System.out.println("Unrecognized Operation");}
					System.out.println("Would you like to use the calculator again?");
					String answer = scan.next();
					if (answer.equalsIgnoreCase("yes")) {
						
					}
					else {loop++;}
				}
	}

}
