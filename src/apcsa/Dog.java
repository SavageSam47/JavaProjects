package apcsa;


public class Dog {

	private String name;
	private int age;
	private double weight;
	
	public Dog(String nn, int na, double nw) {
		name = nn;
		age = na;
		weight = nw;
	}
	
	public Dog(String nn) {
		name = nn;
	}
	
	public Dog() {
		
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
	
	public void speak() {
		System.out.println("Woof!");
	}
	@Override
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
	}
}
