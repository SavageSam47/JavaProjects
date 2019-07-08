

public class L1nkedList {

	LinkedListNode end;
	LinkedListNode start;
	public L1nkedList() {
		start = null;
		end = null;

	}
	
	

	public void Add(int value) {
		LinkedListNode current = start;
		if (start==null) {
			start= new LinkedListNode(value, null,null);
			
		}

		else {
			while (true) {
				if (current.getNext()==null) {
					current.setNext(new LinkedListNode(value, current, null));
					
					break;
				}
				current=current.getNext();
			}
		}	
	}
	public void Print() {
		LinkedListNode current = start;
		while(current.getNext()!=null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
		System.out.println(current.getValue());
		
	}
	public void printBack() {
		LinkedListNode current;
	}
}
