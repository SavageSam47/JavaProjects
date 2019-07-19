import java.util.LinkedList;

public class Queue<Element>{
    private LinkedList<Element> list;
    public Queue(){
        list = new LinkedList<Element>();
    }
    public void Push(Element value){
        list.addFirst(value);
    }
    public Element Pop(){
        return list.removeLast();
    }
    public Boolean isEmpty(){
        return list.isEmpty();
    }
}