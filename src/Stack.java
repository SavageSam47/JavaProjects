

public class Stack<Element>{
    L1nkedList<Element> list;
    public Stack(){
        list = new L1nkedList<Element>();
    }
    public void Place(Element value){
        list.addFirst(value);
    }
    public Element Pop(){
        return list.removeFirst();
    }
}