import java.util.LinkedList;
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**LinkedListNode node1 = new LinkedListNode(1, null, null);
		LinkedListNode node2 = new LinkedListNode(2, node1, null);
		LinkedListNode node3 = new LinkedListNode(3, node2, null);
		LinkedListNode node4 = new LinkedListNode(4, node3, null);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		node1.setValue(5);
		System.out.println(node1.getNext().getValue());*/
		L1nkedList list = new L1nkedList();
		for(int x=2;x<6;x++) {
			list.Add(x);
			
		}
			
			
		
			
			System.out.println(list.getLength());
			System.out.println("---------------------");
			list.printAll();
			System.out.println("---------------------");
			System.out.println(list.addAt(3434, 5));
			
			list.printAll();
			System.out.println("---------------------");
			System.out.println(list.getLength());
	}
}
