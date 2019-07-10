
public class LinkedListNode<Element> {

	private Element value;
	private LinkedListNode<Element> previous;
	private LinkedListNode<Element> next;
	
	public LinkedListNode(Element value1, LinkedListNode<Element> previous1, LinkedListNode<Element> next1) {
		value = value1;
		previous = previous1;
		next = next1;
	}
	
	public Element getValue(){
		return value;
	}
	
	public void setValue(Element v) {
		value = v;
	}
	
	public void setNext(LinkedListNode<Element> n) {
		next = n;
	}
	
	public LinkedListNode<Element> getNext() {
		return next;
	}
	
	public void setPrevious(LinkedListNode<Element> n) {
		previous = n;
	}
	
	public LinkedListNode<Element> getPrevious() {
		return previous;
	}
	
}
