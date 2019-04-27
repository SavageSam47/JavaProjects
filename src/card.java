import java.util.Random;

public class card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		card card1=new card("Diamonds",4);
		System.out.println(card1);
		System.out.println(card1.getNumber());
		System.out.println(card1.getSuit());
		Random r = new Random();
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
		if (number == 14) {
			return "The suit is " + suit + " and the value is Ace";
		}
		else if (number == 11) {
			return "The suit is " + suit + " and the value is Jack";
		}
		else if (number == 12) {
			return "The suit is " + suit + " and the value is Queen";
		}
		else if (number == 13) {
			return "The suit is " + suit + " and the value is King";
		}
		else {
			return "The suit is " + suit + " and the value is " + number;
		}
	}
}
