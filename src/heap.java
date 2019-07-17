import java.util.ArrayList;

public class heap {
    ArrayList<heapNode> list;
    heapNode start = null;

    public heap() {
        list = new ArrayList<heapNode>();
        list.add(new heapNode(0, null, null, null));
    }

    public void add(int value) {
        // heapNode current = ArrayList
        if (list.size() == 1) {
            list.add(new heapNode(value, null, null, null));
            start = list.get(1);
            return;
        }
        int size = list.size();

        while (true) {

        }
        // if(value<list.get(list.indexOf())){

        // }
    }
}