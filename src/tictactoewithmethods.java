import java.util.Scanner;
public class tictactoewithmethods {

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
		while (loop<9) {

			printboard(board);
			int loop1 = 0;
			while (loop1==0) {
				System.out.println("Player X type coordnate one:");
				int xp1 = scan.nextInt();
				System.out.println("Player X type coordnate two:");
				int yp1 = scan.nextInt();

				
				if (board[xp1][yp1].equals("O ") || board[xp1][yp1].equals("X ")) {
					System.out.println("That spot is already taken. Try again.");
				}
				else {
					loop1++;
					loop++;
					board [xp1][yp1]="X ";
				}

			}
			//Check all
			if (board[0][0].equals("X ") && board[0][1].equals("X ") && board[0][2].equals("X ")||
					board[1][0].equals("X ") && board[1][1].equals("X ") && board[1][2].equals("X ")||
					board[2][0].equals("X ") && board[2][1].equals("X ") && board[2][2].equals("X ")) {
				System.out.println("Player X wins");
				break;
			}
			if (board[0][0].equals("X ") && board[1][0].equals("X ") && board[2][1].equals("X ")||
					board[0][1].equals("X ") && board[1][1].equals("X ") && board[2][1].equals("X ")||
					board[0][2].equals("X ") && board[1][2].equals("X ") && board[2][2].equals("X ")) {
				System.out.println("Player X wins");
				break;
			}
			if (board[0][0].equals("X ") && board[1][1].equals("X ") && board[2][2].equals("X ")||
					board[0][2].equals("X ") && board[1][1].equals("X ") && board[2][0].equals("X ")) {
				System.out.println("Player X wins");
				break;
			}
			printboard(board);
			if (loop==9) {
				System.out.println("Its a Tie.");
				break;
			}
			int loop2 = 0;
			while (loop2 == 0) {
				System.out.println("Player O type coordnate one:");
				int xp2 = scan.nextInt();
				System.out.println("Player O type coordnate two:");
				int yp2 = scan.nextInt();


				if (board[xp2][yp2].equals("X ")||board[xp2][yp2].equals("O ")) {
					System.out.println("That spot is already taken. Try again.");
				}
				else {
					loop2++;
					loop++;
					board [xp2][yp2] ="O ";
				}
			}
			if (board[0][0].equals("O ") && board[0][1].equals("O ") && board[0][2].equals("O ")||
					board[1][0].equals("O ") && board[1][1].equals("O ") && board[1][2].equals("O ")||
					board[2][0].equals("O ") && board[2][1].equals("O ") && board[2][2].equals("O ")) {
				System.out.println("Player O wins");
				break;
			}
			if (board[0][0].equals("O ") && board[1][0].equals("O ") && board[2][1].equals("O ")||
					board[0][1].equals("O ") && board[1][1].equals("O ") && board[2][1].equals("O ")||
					board[0][2].equals("O ") && board[1][2].equals("O ") && board[2][2].equals("O ")) {
				System.out.println("Player O wins");
				break;
			}
			if (board[0][0].equals("O ") && board[1][1].equals("O ") && board[2][2].equals("O ")||
					board[0][2].equals("O ") && board[1][1].equals("O ") && board[2][0].equals("O ")) {
				System.out.println("Player O wins");
				break;
			}
			


		}
	}
	public static String[][] printboard(String board[][]) {
		for(int x=0; x<3; x++) {
			for(int y=0;y<3;y++) {
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
		return board;
	}
}
