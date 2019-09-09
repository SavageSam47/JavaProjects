
public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car1=new car("V-cilinder","flextape",5);
		car1.setEngine("flex seal");
		System.out.println(car1.getBrand());
		System.out.println(car1);
	}
	
	//constructors/////////////////
	private static String engineType;
	private static String brand;
	private static int mpg;
	
	
	
	
	
	public car(String et, String b, int mg){
		engineType =et;
		brand=b;
		mpg=mg;
	}
	/////////////////////////
	
	////getters///////////
	public String getEngineType() {
		return engineType;
	}
	public String getBrand() {
		return brand;
	}
	public int getMPG() {
		return mpg;
	}
	//////////////////
	///setters////////////
	public void setEngine(String change_engine) {
		engineType=change_engine;
	}
	public void setBrand(String change_brand) {
		brand=change_brand;
	}
	public void setMPG(int change_mpg) {
		mpg=change_mpg;
	}
	///////////////////////////
	////tostring//////////////
	@Override
	public String toString() {
		return "Car's engine type: " + engineType + "   Brand: " + brand;
		
	}
	
	
	
}
