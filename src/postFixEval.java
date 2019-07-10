import java.util.ArrayList;

public class postFixEval{
    private Stack<Object> stack = new Stack<Object>();
    int opnum = 0;
    public postFixEval(){
        
    }

    public void addInt(int newVal) {
        stack.Place(newVal);
    }

    public void addOperator(String operator) {
        int first1 = (int) stack.Pop();
        int second1 = (int) stack.Pop();
        if(opnum>stack.getSize()){
            System.out.println("Too Many Operators");
        }
        else if(operator.equals("+")){
            stack.Place(first1+second1);
        }
        else if(operator.equals("-")){
            stack.Place(first1-second1);
        }
        else if(operator.equals("*")){
            stack.Place(first1*second1);
        }
        else if(operator.equals("/")){
            stack.Place(first1/second1);
        }
        opnum++;
    }

    public int result() {
        int last = (int) stack.Pop();
        return last;
    }
}