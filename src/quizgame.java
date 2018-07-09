import java.util.Scanner;
public class quizgame {

	public static void main(String[] args) {
		int score=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Question 1: When you die in roblox, what is the noise?");
		String question1 = scan.next();
		if (question1.equalsIgnoreCase("OOF")) {
			System.out.println("Correct");
			score+=1;
		}
		else {System.out.println("Incorrect");}
		System.out.println("Question 2: How many sevens are there in 28?");
		int question2 = scan.nextInt();
		if (question2 == 0) {System.out.println("Correct");
		score+=1;}
		else {System.out.println("Incorrect, there is only a 2 and an 8");}
		System.out.println("Question 3: How many Gbs of memory do the computers of the Java section of summertech have?");
		int question3 = scan.nextInt();
		if (question3 == 16) {System.out.println("Correct"); score+=1;}
		else {System.out.println("Incorrect");}
		System.out.println("Question 4: What is the Ip of the Summertech mincraft server?");
		String question4 = scan.next();
		if (question4.equals("10.144.4.97")) {System.out.println("Correct"); score+=1;}
		else {System.out.println("Incorrect");}
		System.out.println("Question 5: Did you get 100% on this quiz");
		String question5 = scan.next();
		if (score == 4 && question5.equalsIgnoreCase("Yes")) {System.out.println("Thank you for being honest.");}
		else if(score < 4 && question5.equalsIgnoreCase("No")) {System.out.println("Thank you for being honest.");}
		else {System.out.print("Liar!");}
	}
}

