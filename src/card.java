
public class card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		card card1=new card("Diamonds",4);
		System.out.println(card1);
		System.out.println(card1.getNumber());
		System.out.println(card1.getSuit());
	}
	private  String suit;
	private  int number;
	
	public card(String et, int mg){
		suit =et;
		number=mg;
	}
	
	public String getSuit() {
		return suit;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return "The winner is the " + number + " of " + suit;
		
	}
}
