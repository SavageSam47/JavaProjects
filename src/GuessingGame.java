import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loop = 0;

		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int x=rand.nextInt(21);
		System.out.println("Pick a number between 0 and 20");
		while(loop<5) {
			int y = scan.nextInt();
			if (x == y) {System.out.println("You are correct!");
			loop=5;}
			
			else {System.out.println("You are wrong. Try again!");
			if (x>y) {System.out.println("You are too low");}
			else if (x<y) {System.out.println("You are too high");}
			}
			loop++;
		}
		System.out.println("Game over, the number was " + x);
	}

}
