package apcsa;


public class Dog {
	private static int globalObjectCount = 1;
	private static final double CONVERSION = 2.2;

	private String name;
	private int age;
	private double weight;
	private int id;


	public Dog(String nn, int na, double nw) {
		name = nn;
		age = na;
		weight = nw;
		id = globalObjectCount++;
	}
	
	public Dog(String nn) {
		name = nn;
		id = globalObjectCount++;
	}
	
	public Dog() {
		id = globalObjectCount++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setName(String nn) {
		name = nn;
	}
	
	public void setAge(int nn) {
		age = nn;
	}
	
	public void setWeight(double nn) {
		weight = nn;
	}

	public int getId(){
		return id;
	}

	public static double convertToLBS(double kg){
		return kg*CONVERSION;
	}
	
	public void speak() {
		System.out.println("Woof!");
	}
	@Override
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
	}
}
