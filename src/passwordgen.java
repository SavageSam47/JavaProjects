import java.security.SecureRandom;
import java.util.*;

public class passwordgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password length");
		int length = scan.nextInt();
		scan.close();
		System.out.println(passwordgenerator(length));
	}
	
	private static String passwordgenerator(int length){
		ArrayList<Character> list = new ArrayList<Character>();
		System.out.println("Generating...");
		System.out.println("Your new password is : ");
		
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=-/.?<>";
		
		String values = Capital_chars + Small_chars + numbers + symbols;
		
		SecureRandom rand = new SecureRandom();
		for(int x=0;x<values.length();x++){
			list.add(values.charAt(x));
		}

		String finalPass = "";
		for (int x = 0; x<length; x++){
			finalPass += list.get(rand.nextInt(values.length()));
		}
		return finalPass;
	}

}
