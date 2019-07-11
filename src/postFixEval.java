

public class postFixEval{
    private Stack<Object> stack = new Stack<Object>();
    int opnum = 0;
    public postFixEval(){
        
    }

    public void addInt(int newVal) {
        stack.push(newVal);
    }

    public void addOperator(String operator) {
        if(opnum>stack.getSize()){
            System.out.println("Too Many Operators");
        }
        int first1 = (int) stack.pop();
        int second1 = (int) stack.pop();
        if(operator.equals("+")){
            stack.push(first1+second1);
            opnum++;
        }
        else if(operator.equals("-")){
            stack.push(first1-second1);
            opnum++;
        }
        else if(operator.equals("*")){
            stack.push(first1*second1);
            opnum++;
        }
        else if(operator.equals("/")){
            stack.push(first1/second1);
            opnum++;
        }
        opnum--;
    }

    public int result() {
        int last = (int) stack.pop();
        return last;
    }
}