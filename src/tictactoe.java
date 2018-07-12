import java.util.Scanner;
public class tictactoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String [][] board =new String [3][3];
		int loop=0;
		for(int x=0; x<3; x++) {
			for(int y=0;y<3;y++) {
				board[x][y]="- ";
			}
		}
		while (loop==0) {
			
			for (int x=0; x<3; x++) {
				for(int y=0; y<3; y++) {
					System.out.print(board[x][y]);
				}
				System.out.println();
				loop++;
			}
		}
	}

}
