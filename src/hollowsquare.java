import java.util.Scanner;
public class hollowsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();

		for (int x=0;x<size;x++) {
			for(int y=0;y<size;y++) {
				if (x==0||x==(size-1)||y==0||y==(size-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}

	}

}
