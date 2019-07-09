public class Stacktest{
    public static void main(String[] args){
        Stack stack = new Stack();
        for(int x =0; x<6; x++){
            stack.Place(x);
            
        }
        for(int x =0; x<6; x++){
        }
        System.out.println(stack.Pop());
        stack.Place(434);
        System.out.println(stack.Pop());

    }
}