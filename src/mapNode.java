public class mapNode {
    private String name;
    private String info;
    private mapNode next;

    public mapNode(String name1, String info1, mapNode next1) {
        name = name1;
        info = info1;
        next = next1;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public mapNode getNext() {
        return next;
    }

    public void setName(String name1) {
        name = name1;
    }

    public void setInfo(String info1) {
        info = info1;
    }

    public void setNext(mapNode node) {
        next = node;
    }
}