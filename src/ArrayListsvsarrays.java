import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListsvsarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrray List
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> shoppingList; 
		
		shoppingList = new ArrayList<String>();
		
		shoppingList.add("apple");
		shoppingList.add("cow");
		
		for(int i = 0; i<shoppingList.size(); i++){
			System.out.println(shoppingList.get(i));
		}
		
		System.out.println("\n");
		
		//Normal Array
		
		String[] otherShoppingList = null;
		
		otherShoppingList = new String[3];
		
		
		otherShoppingList[0] = "apple";
		otherShoppingList[1] = "egg";
		otherShoppingList[2] = "cow";
		
		for (int x=0;x<3;x++){
		System.out.println("Item 1: " + otherShoppingList[x]);
		}
		
		
		
	}

}
