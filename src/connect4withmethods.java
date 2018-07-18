import java.util.Scanner;
public class connect4withmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerx = 0;
		int playery = 0;
		int tiecounter = 0;
		boolean xwin = false;
		boolean ywin = false;
		Scanner scan=new  Scanner(System.in);
		String[][] board=new String [6][7];
		for(int x=0;x<6;x++) {
			for (int y=0;y<7;y++){
				board [x][y]="- ";
			}
		}
		printboard(board);
		int loop = 0;
		while (loop==0) {
			int loop2 = 0;
			while (loop2==0) {
				int loopforinput1 = 0;
				while (loopforinput1 == 0) {
					System.out.println("Player X Enter your column 0-6");
					playerx = scan.nextInt();
					if (playerx>6 || playerx<0) {
						System.out.println("That number is too high or low. Please re enter.");
					}
					else {
						loopforinput1++;
					}
				}
				for (int x=5;x>=0;x--) {
					if(board[x][playerx].equals("- ")) {
						board [x][playerx]="X ";
						loop2++;
						break;
					}
					else if (x==6) {
						System.out.println("Column is full, try again!");

					}

				}
				xchecker(board, xwin);
				printboard(board);
			}

			for (int x=0; x<6; x++) {
				for(int y=0; y<7; y++) {
					if (tiecounter == 42) {
						System.out.println("Tie.");
						System.exit(0);

					}
					else if(board [x][y].equals("Y ") || board [x][y].equals("X ")) {
						tiecounter++;
					}
					else {
						tiecounter=0;
					}
				}
			}


			int loop1 = 0;
			while (loop1==0) {
				int loopforinput2 = 0;
				while(loopforinput2 == 0) {
					System.out.println("Player Y Enter your column 0-6");
					playery = scan.nextInt();
					if (playery > 6 || playery <0) {
						System.out.println("That number is too high or low. Please re enter.");
					}
					else {
						loopforinput2++;
					}
				}
				for (int x=5;x>=0;x--) {
					if(board[x][playery].equals("- ")) {
						board [x][playery]="Y ";
						loop1++;
						break;
					}
					else if (x==6) {
						System.out.println("Column is full, try again!");
					}	
				}
			}

			printboard(board);
			ychecker(board, ywin);


			for (int x=0; x<6; x++) {
				for(int y=0; y<7; y++) {
					if (tiecounter == 42) {
						System.out.println("Tie.");
						System.exit(0);

					}
					else if(board [x][y].equals("Y ") || board [x][y].equals("X ")) {
						tiecounter++;
					}
					else {
						tiecounter=0;
					}
				}
			}

		}

	}
	public static String[][] printboard(String board[][]) {
		for (int x=0; x<6; x++) {
			for(int y=0;y<7;y++) {
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
		return board;
	}
	public static boolean xchecker(String board[][], boolean xwin) {
		int counterX = 0;
		//Horizontal CheckerX
		for(int x=5;x>=0;x--) {
			counterX = 0;
			for(int y = 0;y<7;y++) {
				if(board [x][y].equals("X ")) {
					counterX++;
					if(counterX==4) {
						printboard(board);
						System.out.println("Player X WINS!!!");
						System.exit(0);
					}

				}
				else {
					counterX = 0;
				}

			}

		}
		//Vertical CheckerX
		//int y = 0;y<7;y++
		for(int y = 0;y<7;y++) {
			counterX = 0;
			for(int x=5;x>=0;x--) {
				if(board [x][y].equals("X ")) {
					counterX++;
					if(counterX==4) {
						printboard(board);
						System.out.println("Player X WINS!!!");
						System.exit(0);
					}

				}
				else {
					counterX = 0;
				}

			}

		}
		int diagonalcounterX = 0;
		for (int x = 0; x<3; x++) {
			diagonalcounterX = 0;
			for(int y=0; y<4; y++) {
				if (board [x][y].equals("X ")) {

					if (board[x][y].equals("X ")) {
						diagonalcounterX++;
						if (diagonalcounterX == 4) {
							printboard(board);
							System.out.println("Player X Wins!!!");
							System.exit(0);

						}
					}
					else {
						diagonalcounterX = 0;
					}
				}
			}
		}
		for (int x = 5; x>=3; x--) {
			diagonalcounterX = 0;
			for(int y=0; y<4; y++) {
				if (board [x][y].equals("X ")) {
					int z = y;

					for (int a = x; a>=0; a--,z++) {

						if (board[a][z].equals("X ")) {
							diagonalcounterX++;
							if (diagonalcounterX == 4) {
								printboard(board);
								System.out.println("Player X Wins!!!");
								System.exit(0);

							}
						}
						else {
							diagonalcounterX = 0;
							z=0;
						}


					}
				}
			}
		}
		return xwin;
	}
	public static boolean ychecker(String board[][], boolean ywin) {
		int counterY = 0;
		for(int x=5;x>=0;x--) {
			counterY=0;
			for(int y = 0;y<7;y++) {
				if(board [x][y].equals("Y ")) {
					counterY++;
					if(counterY==4) {
						printboard(board);
						System.out.println("Player Y WINS!!!");
						System.exit(0);
					}
				}
				else {
					counterY=0;
				}

			}

		}
		//int x=5;x>=0;x--
		//int y = 0;y<7;y++
		for(int y = 0;y<7;y++) {
			counterY=0;
			for(int x=5;x>=0;x--) {
				if(board [x][y].equals("Y ")) {
					counterY++;
					if(counterY==4) {
						printboard(board);
						System.out.println("Player Y WINS!!!");
						System.exit(0);
					}
				}
				else {
					counterY=0;
				}

			}

		}
		int diagonalcounterY = 0;
		for (int x = 0; x<3; x++) {
			diagonalcounterY = 0;
			for(int y=0; y<4; y++) {
				if (board [x][y].equals("Y ")) {
					for (int a = x; a<5; a++) {
						for (int z = y; z<5; z++) {
							if (board[a][z].equals("Y ")) {
								diagonalcounterY++;
								if (diagonalcounterY == 4) {
									printboard(board);
									System.out.println("Player Y Wins!!!");
									System.exit(0);

								}
							}
							else {
								diagonalcounterY = 0;
							}

						}
					}
				}
			}
		}
		for (int x = 5; x>=3; x--) {
			diagonalcounterY=0;
			for(int y=0; y<4; y++) {
				if (board [x][y].equals("Y ")) {
					int z = y;

					for (int a = x; a>=0; a--,z++) {

						if (board[a][z].equals("Y ")) {
							diagonalcounterY++;
							if (diagonalcounterY == 4) {
								printboard(board);
								System.out.println("Player Y Wins!!!");
								System.exit(0);

							}
						}
						else {
							diagonalcounterY = 0;
							z=0;
						}


					}
				}
			}
		}
		return ywin;
	}






}
