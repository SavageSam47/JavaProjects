
public class L1nkedList {
	LinkedListNode end;
	LinkedListNode start;
	int length = getLength();
	public L1nkedList() {
		start = null;
		end = null;	
	}
	//o(1)
	public void Add(int value) {
		if (start==null) {
			start= new LinkedListNode(value, null,null);	
		}
		else {
			end.setNext(new LinkedListNode(value, end, null));
			end = end.getNext();
		}	
	}
	//o(n)
	public void printAll() {
		LinkedListNode current = start;
		while(current.getNext()!=null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
		System.out.println(current.getValue());
	}
	//o(n)
	public void printBack() {
		LinkedListNode current = end;
		while(current.getPrevious()!=null) {
			System.out.println(current.getValue());
			current = current.getPrevious();
		}
		System.out.println(current.getValue());
	}
	//o(n)
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
	//o(n)

	//O(N)
	public boolean contains(int c){
		LinkedListNode current = start;
		while (true){
			if (current.getValue()==c){
				return true;
			}
			else if(current.getNext()==null && current.getValue()!=c){
				return false;
			}
			else{
				current = current.getNext();
			}
		}
	}
	//o(n)
	public boolean findRemove(int c){
		int run = 0;
		LinkedListNode current = start;
		while (true){
			if (c==start.getValue()){
				current.getNext().setPrevious(null);
				start = current.getNext();
				return true;
			}
			else if (c==end.getValue()){
				end.getPrevious().setNext(null);
				end = end.getPrevious();
				return true;
			}
			else if (current.getValue()==c && c!=start.getValue() && c!=end.getValue()){
				current.getPrevious().setNext(current.getNext());
				current.getNext().setPrevious(current.getPrevious());
				current.setNext(null);
				current.setPrevious(null);
				return true;
			}
			else if(current.getNext()==null && current.getValue()!=c){
				return false;
			}
			else{
				current = current.getNext();
				run++;
			}	
		}	
	}
	//o(n)
	public boolean removeAt(int index){
		int run = 0;
		LinkedListNode current = start;
		if(index<0 || index>length-1){
			return false;
		}
		else{
			while(true){
				if (index==0){
					current.getNext().setPrevious(null);
					start = current.getNext();
					return true;
				}
				else if (index==length-1){
					end.getPrevious().setNext(null);
					end = end.getPrevious();
					return true;
				}
				else if (index != 0 && index != length && run==index){
					current.getPrevious().setNext(current.getNext());
					current.getNext().setPrevious(current.getPrevious());
					current.setNext(null);
					current.setPrevious(null);
					return true;
				}
				else if(run>length){
					return false;
				}
				else{
					current = current.getNext();
					run++;
				}
			}
		}
	}
	//o(n)
	public boolean addAt(int value, int index) {
		LinkedListNode current = start;
		if (index>length || index<0){
			return false;
		}
		else{
			if (index==0){
				start.setPrevious(new LinkedListNode(value, null, current));
				start = start.getPrevious();
				start.getNext().setPrevious(start);
				return true;
			}
			else if (index==1){
				current.setNext(new LinkedListNode(value, current, current.getNext()));
				current.getNext().getNext().setPrevious(current.getNext());
				return true;
			}
			else if (index==length){
				current = end;
				current.setNext(new LinkedListNode(value, current, null));
				end = current.getNext();
				return true;
			}
			else{
				for (int x=0;x<index;x++){
					current = current.getNext();
					if (x==index-2){
						if (current != null){
							current.setNext(new LinkedListNode(value, current, current.getNext()));
							current.getNext().getNext().setPrevious(current.getNext());
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