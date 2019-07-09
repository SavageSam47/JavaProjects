

public class Stack{
    L1nkedList list;
    public Stack(){
        list = new L1nkedList();
    }
    public void Place(int value){
        list.addFirst(value);
    }
    public int Pop(){
        return list.removeFirst();
    }
}