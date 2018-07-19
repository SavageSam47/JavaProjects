import java.util.Scanner;
public class bubblesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int [] array= new int [10];
		for (int a = 0; a<10; a++) {
			System.out.println("Enter Value for position " + (a + 1));
			array [a] = scan.nextInt();
		}
		for(int x = 0; x<9; x++) {
			if(array[x]>array[x+1]) {
				int a = array [x];
				array[x]=array[x+1];
				array[x+1]=a;
			}
		}
		for(int x = 0; x<10; x++) {
			System.out.print(array[x]+"   ");
		}
	}

}
