import java.util.Random;
public class decksplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		card [] deck2=new card[26];
		card [] deck1=new card[26];
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
		splitter1(deck,deck1);
		splitter2(deck,deck2);
		for(int c=0; c<26; c++) {
			System.out.println(deck1[c]);
		}
		System.out.println("--------------------------------------------");
		for(int c=0; c<26; c++) {
			System.out.println(deck2[c]);
		}
	}

	public static card[] shuffle(card [] deck) {
		Random ran=new Random();
		
		for (int c=0;c<99999;c++) {
			int number =ran.nextInt(52);
			int number2 = ran.nextInt(52);
			card a = deck[number];
			card b = deck[number2];
			deck[number] = b;
			deck[number2]= a;
		}
		
		return deck;
	}
	public static card[] splitter1(card [] deck, card [] deck1) {
		
		
		for(int c=0;c<26;c++) {
			deck1[c]=deck[c];
		}
		
		return deck1;
	}
	public  static card[] splitter2(card [] deck, card[] deck2) {
		int d = 0;
		for(int c=26;c<52;c++,d++) {
			deck2[d]=deck[c];
		}
		return deck2;
	}
}
