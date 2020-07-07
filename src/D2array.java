import java.util.Scanner;
public class D2array {;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter range end 1:");
		int input1 = scan.nextInt();
		System.out.println("Enter range end 2:");
		int input2 = scan.nextInt();

		int [][] array=new int [input1][input2];
		for (int x=0; x<input1; x++) {
			for(int y=0; y<input2; y++) {
				array [x][y]=1;
				
			}
			
		}
		for(int x=0; x<array.length; x++) {
			for(int y=0; y<array[x].length; y++) {
				System.out.print(array[x][y] + " ");
			}
			System.out.println();
		}
		
		
}

}
