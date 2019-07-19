import java.util.ArrayList;

public class AdjacencyMatrix {
    private ArrayList<ArrayList<Integer>> list;

    public AdjacencyMatrix() {
        list = new ArrayList<ArrayList<Integer>>();
    }

    public void addVertex() {
        for (int x = 0; x < list.size(); x++) {
            list.get(x).add(0);
        }
        list.add(new ArrayList<Integer>());
        for (int x = 0; x < list.size(); x++) {
            list.get(list.size() - 1).add(0);
        }
    }

    public void addEdge(int node1, int node2) {
        list.get(node1).set(node2, 1);
        list.get(node2).set(node1, 1);
    }

    public void removeEdge(int node1, int node2) {
        list.get(node1).set(node2, 0);
        list.get(node2).set(node1, 0);
    }

    public void print() {
        for (int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }
    }

    public boolean getEdge(int node1, int node2) {
        return list.get(node1).get(node2) >= 1;
    }

    public int getVerticies() {
        return list.size();
    }

    public void addEdge(int node1, int node2, int weight) {
        list.get(node1).set(node2, weight);
        list.get(node2).set(node1, weight);
    }

    public int getEdgeWeight(int node1, int node2){
        return list.get(node1).get(node2);
    }

}
