
public class diagonalchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] board=new String [6][7];
		for(int x=0;x<6;x++) {
			for (int y=0;y<7;y++){
				board [x][y]="- ";
			}
		}
		int diagonalcounterX = 0;
		for (int x = 0; x<6; x++) {
			diagonalcounterX = 0;
			for(int y=0; y<7; y++) {
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
	}

}
