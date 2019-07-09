public class Queuetest{
    public static void main(String[] args){
        Queue q = new Queue();
        q.Push(6);
        q.Push(5);
        q.Push(4);
        System.out.println(q.Pop());
    }
}