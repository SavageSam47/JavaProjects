

public class postFixTest{
    public static void main(String[] args){
        postFixEval eval = new postFixEval();
        /*eval.addOperator("+");
        eval.addInt(5);
        eval.addInt(2);
        eval.addInt(2);
        eval.addOperator("+");
        eval.addOperator("*");
        eval.addInt(5);
        eval.addInt(2);
        eval.addInt(2);
        eval.addOperator("+");
        eval.addOperator("*");
        eval.addOperator("+");
        eval.addOperator("++");
        eval.addOperator("++");
        eval.addOperator("++");
        eval.addOperator("++");*/
        eval.addInt(1);
        eval.addInt(2);
        eval.addOperator("+");
        eval.addOperator("+++");
        eval.addInt(1);
        eval.addInt(2);
        eval.addOperator("+");
        eval.addOperator("+++");
        eval.addOperator("*");

        // eval.addOperator("+");
        // eval.addInt(35);
        // eval.addInt(35);
        // eval.addOperator("+");
        System.out.println(eval.result());
    }
}
