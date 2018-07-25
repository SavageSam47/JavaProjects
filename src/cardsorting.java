
public class cardsorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		card card1 = new card("Diamonds", 4);
		card card2 = new card("Spades", 8);

		if (card1.getNumber()>card2.getNumber()) {
			System.out.println(card1);
		}
		else if (card1.getNumber()<card2.getNumber()) {
			System.out.println(card2);
		}

	}

}
