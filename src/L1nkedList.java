

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
	public int getLength(){
		if (start==null){
			return 0;
		}
		else{
			LinkedListNode current = start;
			int counter = 0;
			while (current.getNext()!=null){
				current = current.getNext();
				counter++;
			}
			counter++;
			return counter;
		}
	}

	public boolean contains(int c){
		LinkedListNode current = start;
		int run = 0;
		while (true){
			if (current.getValue()==c){
				return true;
			}
			else if(run>getLength()){
				return false;
			}
			else{
				current = current.getNext();
			}
			run++;
			
			
		}
		
	}

	public boolean findRemove(int c){
		int run = 0;
		LinkedListNode current = start;
		while (true){
			if (c==0){
				current.getNext().setPrevious(null);
				start = current.getNext();
			}
			if (c==getLength()){
				while(run>getLength()){
					current = current.getNext();
				}
				current.getPrevious().setNext(null);
				end = current.getPrevious();
			}
			
			else if (current.getValue()==c){
				//System.out.println(current.getPrevious().getNext());
				current.getPrevious().setNext(current.getNext());
				//System.out.println(current.getPrevious().getNext());
				current.getNext().setPrevious(current.getPrevious());
				
				current.setNext(null);
				current.setPrevious(null);
				return true;
			}
			else if(run>getLength()){
				return false;
			}
			else{
				
			}
			current = current.getNext();
			run++;
		
			
		}
		
	}
	
	public boolean addAt(int value, int index) {
		LinkedListNode current = start;
		if (index>getLength() || index<getLength()){
			return false;
		}
		else{
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
					if (x==index-2){
						if (current != null){
							current.setNext(new LinkedListNode(value, current, current.getNext()));
							
						}
						
						
						
						
					}
					else if (current==null) {
						return false;
					}
					
					
					
				}
			}
			return true;
		}
		
		
	}
}
