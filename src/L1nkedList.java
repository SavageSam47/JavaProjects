

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
			System.out.println(current.getValue());
			current = current.getPrevious();
		}
	}

	public boolean addAt(int value, int index) {
		LinkedListNode current = start;
		if (index==0){
			start.setPrevious(new LinkedListNode(value, null, current));
			start = start.getPrevious();
		}
		if (index==1){
			current.setNext(new LinkedListNode(value, current, current.getNext()));
		}
		else{
			for (int x=0;x<index;x++){
				current = current.getNext();
				if (x==index-1){
					if (current != end){
						current.setNext(new LinkedListNode(value, current, current.getNext()));
					
					}
					
					else if (current==end) {
						return false;
					}
				
				
				}

			
		}
	}
		return true;
		
	}
}
