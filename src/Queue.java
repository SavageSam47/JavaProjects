

public class Queue<Element>{
    private L1nkedList<Element> list;
    public Queue(){
        list = new L1nkedList<Element>();
    }
    public void Push(Element value){
        list.addFirst(value);
    }
    public Element Pop(){
        return list.removeLast();
    }
}