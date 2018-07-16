import java.util.Scanner;
public class connect5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerx = 0;
		int playery = 0;
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
				for (int x=0; x<6; x++) {
					for(int y=0;y<7;y++) {
						System.out.print(board[x][y]);
					}
					System.out.println();
				}
			}
			int counterX = 0;
			//Horizontal CheckerX
			for(int x=5;x>=0;x--) {
				for(int y = 0;y<7;y++) {
					if(board [x][y].equals("X ")) {
						counterX++;
						if(counterX==4) {
							System.out.println("Player X WINS!!!");
							loop++;
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
				for(int x=5;x>=0;x--) {
					if(board [x][y].equals("X ")) {
						counterX++;
						if(counterX==4) {
							System.out.println("Player X WINS!!!");
							loop++;
						}

					}
					else {
						counterX = 0;
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

			for (int x=0; x<6; x++) {
				for(int y=0;y<7;y++) {
					System.out.print(board[x][y]);
				}
				System.out.println();
			}
			int counterY = 0;
			for(int x=5;x>=0;x--) {
				for(int y = 0;y<7;y++) {
					if(board [x][y].equals("Y ")) {
						counterY++;
						if(counterY==4) {
							System.out.println("Player Y WINS!!!");
							loop++;
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
				for(int x=5;x>=0;x--) {
					if(board [x][y].equals("Y ")) {
						counterY++;
						if(counterY==4) {
							System.out.println("Player Y WINS!!!");
							loop++;
						}
					}
					else {
						counterY=0;
					}

				}

			}
		}

	}

}
