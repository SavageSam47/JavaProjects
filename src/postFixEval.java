import java.util.ArrayList;

public class postFixEval{
    private Stack<Object> stack = new Stack<Object>();
    
    public postFixEval(){
        
    }

    public void addInt(int newVal) {
        stack.Place(newVal);
    }

    public void addOperator(String operator) {
        int first1 = (int) stack.Pop();
        int second1 = (int) stack.pop();
        if(operator.equals("+")){
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
    }

    public int result() {
        int last = (int) stack.Pop();
        return last;
    }
}