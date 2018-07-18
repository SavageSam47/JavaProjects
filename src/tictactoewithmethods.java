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
			boolean winx = false;
			boolean win = false;
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
			winx = wincheckerx(board, winx);
			if (winx == true) {
				System.out.println("Game Over");
				System.exit(0);
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
			win = wincheckero(board, win);
			if (win == true) {
				System.out.println("Game Over");
				System.exit(0);
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
	public static boolean wincheckerx(String board[][], boolean winx) {
		int counterx = 0;
		for (int x = 0; x<3; x++) {
			counterx = 0;
			for(int y=0; y<3; y++) {

				if (board[x][y].equals("X ")) {

					counterx++;
					if (counterx == 3) {
						printboard(board);
						System.out.println("X WINS");
						winx = true;
						System.exit(0);
					}
				}
				else {
					counterx = 0;
				}
			}
		}
		for (int x = 0; x<3; x++) {
			counterx = 0;
			for(int y=0; y<3; y++) {

				if (board[y][x].equals("X ")) {
					counterx++;
					if (counterx == 3) {
						printboard(board);
						System.out.println("X WINS");
						winx = true;
						System.exit(0);
					}
				}
				else {
					counterx = 0;
				}
			}
		}
		for (int x=0; x<3; x++) {
			counterx = 0;
			for (int y=0; y<3; y++) {
				if (board[x][y].equals("X ")) {
					for (int a=0; a<3; a++) {

						if (board[a][a].equals("X ")) {
							counterx++;
							if (counterx == 3) {
								printboard(board);
								System.out.println("X WINS");
								winx = true;
								System.exit(0);
							}
						}
						else { 
							counterx = 0;

						}
					}
				}
			}
		}
		for (int x=0; x<3; x++) {
			counterx = 0;
			for (int y=0; y<3; y++) {
				if (board[x][y].equals("O ")) {
					for (int a=2; a>=0; a--) {
						for (int z=0; z<3; z++)
							if (board[a][z].equals("O ")) {
								counterx++;
								if (counterx == 3) {
									printboard(board);
									System.out.println("X WINS");
									winx = true;
									System.exit(0);
									
								}
							}
							else { 
								counterx = 0;

							}
					}
				}
			}
		}
		return winx;
	}
	public static boolean wincheckero(String board[][], boolean win) {
		//
		int countero = 0;
		for (int x = 0; x<3; x++) {
			countero = 0;
			for(int y=0; y<3; y++) {

				if (board[x][y].equals("O ")) {

					countero++;
					if (countero == 3) {
						printboard(board);
						System.out.println("O WINS");
						win = true;
						System.exit(0);
					}
				}
				else {
					countero = 0;
				}
			}
		}
		for (int x = 0; x<3; x++) {
			countero = 0;
			for(int y=0; y<3; y++) {

				if (board[y][x].equals("O ")) {
					countero++;
					if (countero == 3) {
						printboard(board);
						System.out.println("O WINS");
						win = true;
						System.exit(0);
					}
				}
				else {
					countero = 0;
				}
			}
		}
		for (int x=0; x<3; x++) {
			countero = 0;
			for (int y=0; y<3; y++) {
				if (board[x][y].equals("O ")) {
					for (int a=0; a<3; a++) {

						if (board[a][a].equals("O ")) {
							countero++;
							if (countero == 3) {
								printboard(board);
								System.out.println("O WINS");
								win = true;
								System.exit(0);
							}
						}
						else { 
							countero = 0;

						}
					}
				}
			}
		}
		for (int x=0; x<3; x++) {
			countero = 0;
			for (int y=0; y<3; y++) {
				if (board[x][y].equals("O ")) {
					for (int a=2; a>=0; a--) {
						for (int z=0; z<3; z++)
							if (board[a][z].equals("O ")) {
								countero++;
								if (countero == 3) {
									printboard(board);
									System.out.println("O WINS");
									win = true;
									
									System.exit(0);
								}
							}
							else { 
								countero = 0;

							}
					}
				}
			}
		}
	

	return win;
}

}
