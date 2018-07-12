import java.util.Scanner;
public class shoppinglist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		System.out.println("How many items would you like to put on the list?");
		int itemnumbers = scan.nextInt();
		String [] array= new String [itemnumbers];
		for (int x=0; x<itemnumbers;x++) {
			System.out.println("Enter an item: ");
			String items = scan2.nextLine();
			array[(x)]=items;
		}
		System.out.println("Would you like to see all of your items or one? (Say all/one)");
		String answer = scan.next();
		if (answer.equalsIgnoreCase("all")) {
			for (int x=0; x<itemnumbers;x++) {
				System.out.println(array[x]);
			}
		}
		else if (answer.equalsIgnoreCase("one")) {
			System.out.println("Enter Item number:");
			int itemnumberchoosen = scan.nextInt();
			System.out.println(array[itemnumberchoosen -1]);
		}
	}

}
