import java.util.Random;
import java.util.Scanner;

public class hangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		// 0 - Discord Bot 1 - Summertech 2 - russellisrude
		int loop = 0;
		String word = null;
		while (loop == 0) {
			int wordpicker = rand.nextInt(3);

			if (wordpicker == 0) {
				word = "Discordbot";
			} else if (wordpicker == 1) {
				word = "Summertech";
			} else if (wordpicker == 2) {
				word = "russellisrude";
			}
			System.out.print("Pick a letter");
			String letter = scan.next();
			for (int x = 0; x < word.length(); x++) {
				if (word.charAt(x) == letter.charAt(0)) {
					System.out.println("that letter is correct");
				}

			}

		}
	}

}
