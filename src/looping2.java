import java.util.ArrayList;

public class looping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aio = new ArrayList<>();

		for(int x = 0;x<10;x++) {
			aio.add(x);
		}
		for(int x : aio){
			System.out.println(x);
		}

	}

}
