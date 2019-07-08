

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
					end = current.getNext();
					
					break;
				}
				current=current.getNext();
			}
		}	
	}
	public void printAll() {
		LinkedListNode current = start;
		while(current.getNext()!=null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
		System.out.println(current.getValue());
		
	}
	public void printBack() {
		LinkedListNode current = end;
		while(current.getPrevious()!=null) {
			System.out.println();
		}
	}
}
