import java.util.ArrayList;

public class postFixTest{
    public static void main(String[] args){
        postFixEval eval = new postFixEval();
        ArrayList<Object> al = new ArrayList();
        al.add(3);
        al.add(4);
        al.add("+");
        al.add(50);
        al.add("*");
        System.out.println(eval.input(al)); 
    }
}