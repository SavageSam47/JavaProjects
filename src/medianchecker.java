import java.util.Scanner;
public class medianchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to input?");
		int oof = scan.nextInt();
		int [] array= new int [oof];

		for (int a = 0; a<oof; a++) {
			System.out.println("Enter Value for position " + (a + 1));
			array [a] = scan.nextInt();
		}
		arraychecker(array, oof);
		printarray(array, oof);
		int median1 = oof%2;
		if(median1==1) {
			int median2 = oof - (oof/2);
			System.out.println();
			System.out.println(array[median2]);
		}
		else if(median1==0) {

		}


	}
	public static int[] printarray(int [] array, int oof) {
		for(int x = 0; x<oof; x++) {
			System.out.println(array[x]+"   ");
		}
		return array;
	}
	public static int[] arraychecker(int [] array, int oof) {
		for (int y = 0; y<oof; y++) {
			for(int x = 0; x<oof-1; x++) {
				if(array[x]>array[x+1]) {
					int a = array [x];
					array[x]=array[x+1];
					array[x+1]=a;
				}
			}
		}
		return array;
	}
}