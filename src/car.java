
public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car1=new car("V-cilinder","flextape",5);
		System.out.print(car1.getBrand());
	}
	
	
	private static String engineType;
	private static String brand;
	private static int mpg;
	
	
	
	
	
	public car(String et, String b, int mg){
		engineType =et;
		brand=b;
		mpg=mg;
	}
	
	public String getengineType() {
		return engineType;
	}
	public String getBrand() {
		return brand;
	}
	public int getMPG() {
		return mpg;
	}
	
}
