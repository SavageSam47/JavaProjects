import java.util.*;

public class passwordgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		System.out.println(passwordgen(length));
	}
	
	static char[] passwordgen(int length){
		System.out.println("Generating...");
		System.out.println("Your new password is : ");
		
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=-/.?<>";
		
		String values = Capital_chars + Small_chars + numbers + symbols;
		
		Random rand = new Random();
		
		char[] password = new char[length];
		
		for (int x = 0; x<length; x++){
			password[x] = 
					values.charAt(rand.nextInt(values.length()));
		}
		return password;
	}

}
