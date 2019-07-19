public class MatrixTest {
    public static void main(String[] args) {
        AdjacencyMatrix matrix = new AdjacencyMatrix();
        matrix.addVertex();
        matrix.addVertex();
        matrix.addVertex();
        matrix.addVertex();
        matrix.addVertex();
        matrix.addVertex();
        matrix.addVertex();
        matrix.addEdge(0, 1);
        matrix.addEdge(0, 2);
        matrix.addEdge(2, 3);
        matrix.addEdge(3, 1);
        matrix.addEdge(3, 6);
        matrix.addEdge(1, 4);
        matrix.addEdge(4, 5);
        System.out.println(GraphSearch.DFS(matrix, 0));
        System.out.println();

        matrix.print();
    }
}