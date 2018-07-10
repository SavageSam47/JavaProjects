import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();
		for(int y = 0; y<input; y++) {
			for(int x = 0; x<input; x++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
