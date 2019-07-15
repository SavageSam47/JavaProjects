public class binarySearchTree {
    binaryNode start = null;

    public binarySearchTree() {

    }

    public void add(int value) {
        binaryNode current = start;
        while (true) {
            System.out.println("test");
            if (start == null) {
                start = new binaryNode(value, null);
                current = start;
                return;
            } else if (value < current.getValue() && current.getChildL() != null) {
                current = current.getChildL();

            } else if (value > current.getValue() && current.getChildR() != null) {
                current = current.getChildR();
            } else {
                if (value < current.getValue()) {
                    current.setChildL(new binaryNode(value, current));
                    return;
                } else if (value > current.getValue()) {
                    current.setChildR(new binaryNode(value, current));
                    return;
                }

            }

        }

    }

    public void printCall(binaryNode start1) {
        binaryNode current = start1;
        System.out.println(current.getValue());
        print(start1);
    }

    public void print(binaryNode start1) {
        binaryNode current = start1;

        if (current.getChildL() == null && current.getChildR() == null) {
            return;
        }
        if (current.getChildL() == null) {

        } else if (current.getChildL() != null) {
            System.out.print(current.getChildL().getValue());
            print(current.getChildL());
        }
        if (current.getChildR() == null) {

        } else if (current.getChildR() != null) {
            System.out.print(current.getChildR().getValue());
            print(current.getChildR());
        }

    }

    public void remove(int value){
        binaryNode current = start;
        if (value>current.getValue() && current.getValue() != value){
            //getting current to value being deleted
        }
        if (current.getChildR()!= null){
            current = current.getChildR();
            while(true){
                if (current.getChildL()!=null){
                    current = current.getChildL()
                }
                else{
                    break;
                }
            }
            
        }
    }

}