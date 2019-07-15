public class binaryNode {

    private int value;
    private binaryNode childL;
    private binaryNode childR;
    private binaryNode parent;

    public binaryNode(int value1, binaryNode parent1) {
        value = value1;
        parent = parent1;
        childR = null;
        childL = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int inputVal) {
        value = inputVal;
    }

    public binaryNode getChildL() {
        return childL;
    }

    public binaryNode getChildR() {
        return childR;
    }

    public binaryNode getParent() {
        return parent;
    }

    public void setChildL(binaryNode left) {
        childL = left;
    }

    public void setChildR(binaryNode right) {
        childR = right;
    }

    public void setParent(binaryNode parent1) {
        parent = parent1;
    }

}