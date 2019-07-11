

public class postFixEval{
    private Stack<Integer> stack = new Stack<Integer>();
    
    public postFixEval(){
        
    }
    
    public void addInt(int newVal) {
        stack.push(newVal);
    }
    
    public void addOperator(String operator) {
        
        if(stack.size()<=0){
            System.out.println("Not enough numbers, add more or print the result!");
            
        }
        else if(stack.size()==1){
            if(operator.equals("++")){
                int only = stack.pop();
                only++;
                stack.push(only);
            }
            System.out.println("Not enough numbers, add more or print the result!");
        }
        
        else{
            if(operator.equals("++")){
                int only = stack.pop();
                only++;
                stack.push(only);
            }
            else{
                
                int first = stack.pop();
                int second = stack.pop();
                if (operator.equals("+")){
                    stack.push(first+second);
                    
                }
                else if(operator.equals("-")){
                    stack.push(second-first);
                    
                }
                else if(operator.equals("*")){
                    stack.push(first*second);
                    
                }
                else if(operator.equals("/")){
                    stack.push(second/first);
                    
                }
            }
            
        }
        
        
    }
    
    
    
    public int result() {
        int last = (int) stack.pop();
        return last;
    }
}