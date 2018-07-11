import java.util.Scanner;
public class palindromi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String word = scan.next();
		int c=0;
		for (int x=0;x<word.length();x++) {
			if (word.charAt(x)==word.charAt(word.length()-(1+x))) {
				c++;
			}

		}
		if (c==word.length()) {
			System.out.print("That is a palindrome!");
		}
		else {
			System.out.print("This is not a palindrome");
		}	
	}

}
