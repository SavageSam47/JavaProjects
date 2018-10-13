package ArrayLists;
public class ArrayList {
	
	static String[] array;
	static String[] temp;
	
	public ArrayList() {
		array = new String[0];
		
	}
	
	public static void add(String str){
		
		temp = new String[array.length + 1];
		
		for(int i = 0; i<array.length; i++){
			temp[i] = array[i];	
		}
		temp[temp.length - 1] = str;
		array = temp;
		
	}
	
	public static void print(){
		for(int i = 0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static void remove(int index){
		
		temp = new String[array.length - 1];
		
		int j = 0;
		
		for(int i = 0; i<array.length; i++){
			if(i != index){
				temp[j] = array[i];
				j++;
			}
			
			
		}
		array = temp;
		
	}
	
	public static int size(){
		return array.length;
		
	}
	
	public static boolean contains(String word){
		return answer;
		
	}
	
	public static boolean isEmpty(){
		
	}
	
	public static void remove(String str){
		for(int x = 0; x<array.length; x++){
			if(array[x] == str){
				//finish
			}
		}
		
		temp = new String[array.length - 1];
		
		int j = 0;
		
		for(int i = 0; i<array.length; i++){
			if(i != index){
				temp[j] = array[i];
				j++;
			}
			
			
		}
		array = temp;
	}
	
	

}
