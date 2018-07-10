import java.util.Scanner;
import java.util.Random;
public class rockpapersizzors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0=rock 1=paper 2=scissors
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int loop = 0;
		while(loop==0) { 
			System.out.println("Pick rock, paper, or scissors.");
			int computer = rand.nextInt(3);
			String player  = scan.next();
			if (computer==0 && player.equalsIgnoreCase("rock")) {System.out.println("Draw, go again.");}
			else if (computer==1 && player.equalsIgnoreCase("paper")) {System.out.println("Draw, go again.");}
			else if (computer==2 && player.equalsIgnoreCase("scissors")) {System.out.println("Draw, go again.");}
			else if (computer==0 && player.equalsIgnoreCase("paper")) {System.out.println("You Win!, play again?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("no")) {
				loop++;
			}
			}
			else if (computer==0 && player.equalsIgnoreCase("scissors")) {System.out.println("I win, try again?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("no")) {
				loop++;
			}
			}
			else if (computer==1 && player.equalsIgnoreCase("rock")) {System.out.println("I win, try again?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("no")) {
				loop++;
			}
			}
			else if (computer==1 && player.equalsIgnoreCase("scissors")) {System.out.println("You win, play again?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("no")) {
				loop++;
			}
			}
			else if (computer==2 && player.equalsIgnoreCase("rock")) {System.out.println("You win, play again?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("no")) {
				loop++;
			}
			}
			else if (computer==2 && player.equalsIgnoreCase("paper")) {System.out.println("I win, try again?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("no")) {
				loop++;
			}
			}

		}
		if (loop==1) {System.out.println("Game Over");

		}
	}

}
