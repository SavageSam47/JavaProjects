
public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person person1=new person("Your","Mom",100);
		System.out.println(person1);
	}

	private static String firstName;
	private static String lastName;
	private static int age;
	
	public person(String et, String b, int mg){
		firstName =et;
		lastName=b;
		age=mg;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAGE() {
		return age;
	}
	
	public void setFirstName(String change_firstname) {
		firstName=change_firstname;
	}
	public void setLastName(String change_lastname) {
		lastName=change_lastname;
	}
	public void setAGE(int change_age) {
		age=change_age;
	}
	public String toString() {
		return "Name: " + firstName + " " + lastName + "And he/she is " +  age + "years old.";
		
	}
}
