import java.util.Scanner;
public class medianchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to input?");
		int oof = scan.nextInt();
		double [] array= new double [oof];

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
			System.out.println(array[median2 - 1]);
		}
		else if(median1==0) {
			int median2 = oof - (oof/2);
			double middle = array[median2 -1];
			double middle2 = array[median2 ];
			double answer = ((middle+middle2)/2);
			System.out.println();
			System.out.println(answer);
		}


	}
	public static double[] printarray(double [] array, int oof) {
		for(int x = 0; x<oof; x++) {
			System.out.println(array[x]+"   ");
		}
		return array;
	}
	public static double[] arraychecker(double [] array, int oof) {
		for (int y = 0; y<oof; y++) {
			for(int x = 0; x<oof-1; x++) {
				if(array[x]>array[x+1]) {
					double a = array [x];
					array[x]=array[x+1];
					array[x+1]=a;
				}
			}
		}
		return array;
	}
}