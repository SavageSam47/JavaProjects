
import java.util.ArrayList;
import java.util.Stack;

public class GraphSearch {

    public static ArrayList<Integer> BFS(AdjacencyMatrix matrix, int node) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Integer> q = new Queue<Integer>();
        for (int x = 0; x < matrix.getVerticies(); x++) {
            list.add(Integer.MAX_VALUE);
        }
        list.set(node, 0);
        q.Push(node);
        while (q.isEmpty() == false) {
            int temp = q.Pop();
            for (int x = 0; x < matrix.getVerticies(); x++) {
                if (matrix.getEdge(temp, x) == true && list.get(x) == Integer.MAX_VALUE) {
                    list.set(x, list.get(temp) + 1);
                    q.Push(x);
                }
            }

        }
        return list;

    }

    public static ArrayList<Integer> DFS(AdjacencyMatrix matrix, int node) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int x = 0; x < matrix.getVerticies(); x++) {
            list.add(Integer.MAX_VALUE);
        }
        list.set(node, 0);
        stack.push(node);
        while (stack.isEmpty() == false) {
            int temp = stack.pop();
            for (int x = 0; x < matrix.getVerticies(); x++) {
                if (matrix.getEdge(temp, x) == true && list.get(temp) + 1 < list.get(x)) {
                    list.set(x, list.get(temp) + 1);
                    stack.push(x);
                }
            }

        }
        return list;
    }
}