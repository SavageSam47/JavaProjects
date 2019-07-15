public class binarySearchTreeTest {
    public static void main(String[] args) {
        binarySearchTree tree = new binarySearchTree();
        tree.add(5);
        tree.add(4);
        tree.add(7);
        tree.add(8);
        tree.add(6);
        tree.add(3);
        tree.printCall(tree.start);
        System.out.println(tree.get(3, tree.start));
    }
}