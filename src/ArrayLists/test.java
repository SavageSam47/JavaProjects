package ArrayLists;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList array = new ArrayList();
		array.add("teeth");
		array.add("ghosts");
		array.add("Zombies");
		

		
		array.remove("teeth");
		

		
		System.out.println(array.isEmpty());
		
		System.out.println(array.contains("teeth"));
		System.out.println(array.contains("ghosts"));
	}

}
