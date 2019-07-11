
public class Stack<Element>{
    private L1nkedList<Element> list;
    public Stack(){
        list = new L1nkedList<Element>();
    }
    public void push(Element value){
        list.addFirst(value);
    }
    public Element pop(){
        return list.removeFirst();
    }
    public Element Read(){
        return list.getIndex(0);
    }
    public int size(){
        return list.getLength();
    }
}