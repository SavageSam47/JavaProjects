import java.util.ArrayList;

public class postFixEval{
    Stack<Object> stack = new Stack<Object>();
    public postFixEval(){
        
    }

    public void addInt(int newVal) {
        stack.Place(newVal);
    }

    public void addOperator(String operator) {
        stack.Place(operator);
    }

    public int result() {
        
    }
}