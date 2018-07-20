import java.util.Scanner;
public class meanchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of numbers you would like to input.");
		int amount = scan.nextInt();
		double [] array=new double [amount];
		for (int a = 0; a<amount; a++) {
			System.out.println("Enter Value " + a);
			array[a] = scan.nextInt();
		}
		double total = 0;
		for(int a = 0; a<amount; a++) {
			total=total + array[a];
		}
		System.out.println("Mean: " + (total/amount));
	}

}
