import java.util.Scanner;
public class connect5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new  Scanner(System.in);
		String[][] board=new String [6][7];
		for(int x=0;x<6;x++) {
			for (int y=0;y<7;y++){
				board [x][y]="- ";
			}
		}
		for (int x=0; x<6; x++) {
			for(int y=0;y<7;y++) {
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
		
	}

}
