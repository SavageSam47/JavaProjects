public class heapNode{
    public int value;
    public heapNode childL;
    public heapNode childR;
    public heapNode parent;
    public heapNode(int value1, heapNode parent1, heapNode childL1, heapNode childR1){
        value = value1;
        parent = parent1;
        childL = childL1;
        childR = childR1;
    }
    public int getValue(){
        return value;
    }
    public heapNode getChildL(){
        return childL;
    }
    public heapNode getChildR(){
        return childR;
    }
    public heapNode getParent(){
        return parent;
    }
    public void setValue(int newValue){
        value = newValue;
    }
    public void setChildL(heapNode newChild){
        childL = newChild;
    }
    public void setChildR(heapNode newChild){
        childR = newChild;
    }
    public void setParent(heapNode newParent){
        parent = newParent;
    }
}