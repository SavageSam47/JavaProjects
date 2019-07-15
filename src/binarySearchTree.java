public class binarySearchTree {
    binaryNode start = null;

    public binarySearchTree() {

    }

    public void add(int value) {
        binaryNode current = start;
        while (true) {

            if (start == null) {
                start = new binaryNode(value, null);
            } else if (current.getChildL() == null && current.getChildR() == null) {
                if (value < current.getValue()) {
                    current.setChildL(new binaryNode(value, current));
                    current = current.getChildL();
                    return;
                } else if (value > current.getValue()) {
                    current.setChildR(new binaryNode(value, current));
                    current = current.getChildR();
                    return;
                } else if (value == current.getValue()) {
                    current.setChildR(new binaryNode(value, current));
                    current = current.getChildR();
                    return;
                }

            }
        }

    }

    public void print(binaryNode start1) {
        binaryNode current = start1;
        System.out.println(current.getValue());

        if (current.getChildL() == null && current.getChildR() == null) {
            return;
        }
        if (current.getChildL() == null) {

        } else if (current.getChildL() != null) {
            System.out.println(current.getChildL().getValue());
            print(current.getChildL());
        }
        if (current.getChildR() == null) {

        } else if (current.getChildR() != null) {
            System.out.println(current.getChildR().getValue());
            print(current.getChildR());
        }

    }
}