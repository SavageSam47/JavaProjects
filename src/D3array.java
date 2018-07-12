import java.util.Scanner;

public class D3array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter range end 1:");
		int input1 = scan.nextInt();
		System.out.println("Enter range end 2:");
		int input2 = scan.nextInt();
		System.out.println("Enter range end 3:");
		int input3 = scan.nextInt();

				int [][][] array=new int [input1][input2][input3];
				for (int x=0; x<input1; x++) {
					for(int y=0; y<input2; y++) {
						for(int z=0; z<input3; z++) {
							array [x][y][z]=x*y*z;
						}
						
						
					}
					
				}
				for(int x=0; x<input1; x++) {
					for(int y=0; y<input2; y++) {
						for(int z=0; z<input3; z++) {
						System.out.print(array[x][y][z]);
						}
						System.out.println();
					}
					System.out.println();
				}
				
				
		}

		}
