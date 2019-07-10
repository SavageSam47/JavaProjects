import java.util.ArrayList;

public class postFixTest{
    public static void main(String[] args){
        postFixEval eval = new postFixEval();
        eval.addInt(5);
        eval.addInt(2);
        eval.addInt(3);
        eval.addOperator("*");
        eval.addOperator("+");
        eval.addInt(6);
        eval.addInt(4);
        eval.addOperator("*");
        eval.addOperator("+");
        System.out.println(eval.result());
    }
}