
public class LinkedListNode {

	private int value;
	private LinkedListNode previous;
	private LinkedListNode next;
	
	public LinkedListNode(int value1, LinkedListNode previous1, LinkedListNode next1) {
		value = value1;
		previous = previous1;
		next = next1;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int v) {
		value = v;
	}
	
	public void setNext(LinkedListNode n) {
		next = n;
	}
	
	public LinkedListNode getNext() {
		return next;
	}
	
	
}
