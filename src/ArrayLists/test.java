package ArrayLists;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList array = new ArrayList();
		array.add("teeth");
		array.add("ghosts");
		array.add("Zombies");
		
		array.print();
		
		array.remove("teeth");
		
		array.print();
		
		System.out.println(array.isEmpty());
		
		System.out.println(array.contains("teeth"));
		System.out.println(array.contains("ghosts"));
	}

}
