

public class Queue{
    L1nkedList list;
    public Queue(){
        list = new L1nkedList();
    }
    public void Push(int value){
        list.addFirst(value);
    }
    public int Pop(){
        return list.removeLast();
    }
}