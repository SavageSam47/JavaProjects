package apcsa;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Dog nd = new Dog();
		
		d.setName("Happy");
		d.setAge(3);
		d.setWeight(20.5);
		d.speak();
		
		nd.setName("Sad");
		nd.setAge(4);
		nd.setWeight(24.7);
		nd.speak();
		
		System.out.println(d);
	}

}
