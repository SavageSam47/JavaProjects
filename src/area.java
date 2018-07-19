import java.util.Scanner;
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter dimension X");
		int num1 = scan.nextInt();
		System.out.println("Enter dimension Y");
		int num2 = scan.nextInt();
		area(num1, num2);
		for (int x = 0; x<num2; x++) {
			for(int y = 0; y<num1; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static int area(int num1, int num2) {
		int answer = num1*num2;
		System.out.println("Area: "+answer);
		return answer;
	}
	
	
}
