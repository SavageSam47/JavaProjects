
public class L1nkedList<Element> {
	private LinkedListNode<Element> end;
	private LinkedListNode<Element> start;
	private int length = 0;
	public L1nkedList() {
		start = null;
		end = null;	
	}
	//o(1)
	public void addLast(Element value) {
		if (start==null) {
			start= new LinkedListNode<Element>(value, null,null);
			end=start;
			length++;	
		}
		else {
			end.setNext(new LinkedListNode<Element>(value, end, null));
			end = end.getNext();
			length++;
		}	
	}
	public void addFirst(Element value){
		addAt(value, 0);
	}
	public Element removeFirst(){
		if(length==0){
			return null;
		}
		Element x = start.getValue();
		if(length>1){
			start.getNext().setPrevious(null);
			start = start.getNext();
			length--;
		}
		else if (length==1){
			start = null;
			length--;
		}
		return x;
	}
	
	public Element removeLast(){
		if(length==0){
			return null;
		}
		else{
			Element x = end.getValue();
			removeAt(length);
			return x;
		}
	}
	//o(n)
	public void printAll() {
		LinkedListNode<Element> current = start;
		if(length==0){
			
		}
		else{
			while(current.getNext()!=null) {
				System.out.println(current.getValue());
				current = current.getNext();
			}
			System.out.println(current.getValue());
		}
	}
	//o(n)
	public void printBack() {
		LinkedListNode<Element> current = end;
		while(current.getPrevious()!=null) {
			System.out.println(current.getValue());
			current = current.getPrevious();
		}
		System.out.println(current.getValue());
	}
	//o(n)
	/*public int getLength(){
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
	}*/
	//o(1)
	public int getLength(){
		return length;
	}
	//o(n)
	public Element getIndex(int index){
		LinkedListNode<Element> current = start;
		for(int x=0;x<index+1;x++){
			if (x==index){
				return current.getValue();
			}
			else{
				current = current.getNext();
			}
		}
		return null;
	}
	
	//O(N)
	public boolean contains(Element c){
		LinkedListNode<Element> current = start;
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
	public boolean findRemove(Element c){
		
		LinkedListNode<Element> current = start;
		while (true){
			if (c==start.getValue()){
				current.getNext().setPrevious(null);
				start = current.getNext();
				length--;
				return true;
			}
			else if (c==end.getValue()){
				end.getPrevious().setNext(null);
				end = end.getPrevious();
				length--;
				return true;
			}
			else if (current.getValue()==c && c!=start.getValue() && c!=end.getValue()){
				current.getPrevious().setNext(current.getNext());
				current.getNext().setPrevious(current.getPrevious());
				current.setNext(null);
				current.setPrevious(null);
				length--;
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
	/*public boolean removeAt(int index){
		int run = 0;
		LinkedListNode<Element> current = start;
		if(index<0 || index>length-1){
			return false;
		}
		if(index==0 && length==1){
			start=null;
			end=null;
			length--;
			return true;
		}
		else{
			while(true){
				
				if (index==0 && length>1){
					start.getNext().setPrevious(null);
					start = start.getNext();
					length--;
					return true;
				}
				else if (index==length-1 && length>1){
					end.getPrevious().setNext(null);
					end = end.getPrevious();
					length--;
					return true;
				}
				else if (index != 0 && index != length && run==index && length>1){
					current.getPrevious().setNext(current.getNext());
					current.getNext().setPrevious(current.getPrevious());
					current.setNext(null);
					current.setPrevious(null);
					length--;
					return true;
				}
				else if(run>length){
					return false;
				}
				else if (length>1){
					current = current.getNext();
					run++;
				}
			}
		}
	}*/
	public boolean removeAt(int i){
		LinkedListNode<Element> current = start;
		if(i<0 || i>length){
			return false;
		}
		else{
			if(i==0 && length==1){
				start = null;
				length--;
				return true;
				
			}
			else if(length>1){
				if(i==1){
					start.getNext().setPrevious(null);
					start = start.getNext();
					length--;
					return true;
				}
				if(i==length){
					end.getPrevious().setNext(null);
					end = end.getPrevious();
					length--;
					return true;
				}
				else if (i>0 && i<length){
					for(int c = 0;c<i+1;c++){
						current = current.getNext();
					}
					current.getNext().setPrevious(current.getPrevious());
					current.getPrevious().setNext(current.getNext());
					length--;
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}
	}
	//o(n)
	public boolean addAt(Element value, int index) {
		LinkedListNode<Element> current = start;
		if (index>length || index<0){
			return false;
		}
		else{
			if (start==null){
				start = new LinkedListNode<Element>(value, null, null);
				end=start;
				length++;
				return true;
				
			}
			else if (index==0){
				start.setPrevious(new LinkedListNode<Element>(value, null, start));
				start = start.getPrevious();
				start.getNext().setPrevious(start);
				length++;
				return true;
			}
			else if (index==1){
				current.setNext(new LinkedListNode<Element>(value, current, current.getNext()));
				current.getNext().getNext().setPrevious(current.getNext());
				length++;
				return true;
			}
			else if (index==length){
				current = end;
				current.setNext(new LinkedListNode<Element>(value, current, null));
				end = current.getNext();
				length++;
				return true;
			}
			else{
				for (int x=0;x<index;x++){
					current = current.getNext();
					if (x==index-2){
						if (current != null){
							current.setNext(new LinkedListNode<Element>(value, current, current.getNext()));
							current.getNext().getNext().setPrevious(current.getNext());
							length++;
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
	public void rotateRight(){
		if(length==0){
			
		}
		else{
			addFirst(end.getValue());
			end = end.getPrevious();
			end.setNext(null);
		}
	}
	
	public void rotateLeft(){
		if(length==0){
			
		}
		else{
			addLast(start.getValue());
			start = start.getNext();
			start.setPrevious(null);
		}
		
		
	}
}