import java.util.*;
public class deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		card [] deck=new card[52];
		int b=0;
		for(int c=2; c<15;c++,b++) {
			deck[b]= new card("Hearts",c);
		}
		int d =13; 
		for(int c=2; c<15;c++,d++) {
			deck[d]= new card("Diamonds",c);
		}
		int e = 26;
		for(int c=2; c<15;c++,e++) {
			deck[e]= new card("Spades",c);
		}
		int f = 39;
		for(int c=2; c<15;c++,f++) {
			deck[f]= new card("Clubs",c);
		}
		shuffle(deck);
		for(int c=0; c<52; c++) {
			System.out.println(deck[c]);
		}
	}

	public static card[] shuffle(card [] deck) {
		Random ran=new Random();
		for (int c=0;c<5000;c++) {
			int number =ran.nextInt(52);
			int number2 = ran.nextInt(52);
			card a = deck[number];
			card b = deck[number2];
			deck[number] = b;
			deck[number2]= a;
		}
		return deck;
	}
}
