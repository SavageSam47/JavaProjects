
public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(atFirst("a"));
	}


	public static String atFirst(String str) {
		if (str.length() < 2) {
			for (int x = 0; x < str.length(); x++) {
				str += '@';
			}
		} else {
			str = str.substring(0, 2);
		}
		return str;
	}
}