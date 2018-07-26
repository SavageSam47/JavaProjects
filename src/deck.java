
public class deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		card [] deck=new card[52];
		int b=0;
		for(int c=2; c<14;c++,b++) {
			deck[b]= new card("Hearts",c);
		}
		int d =14; 
		for(int c=2; c<14;c++,d++) {
			deck[d]= new card("Diamonds",c);
		}
		int e = 28;
		for(int c=2; c<14;c++,e++) {
			deck[e]= new card("Spades",c);
		}
		int f = 42;
		for(int c=2; c<14;c++,f++) {
			deck[f]= new card("Clubs",c);
		}
		for(int c=0; c<52; c++) {
			System.out.println(deck[c]);
		}
	}

}
