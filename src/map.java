public class map {
    mapNode start = null;

    public map() {

    }

    public void add(String name, String info) {
        mapNode current = start;
        if (start == null) {
            start = new mapNode(name, info, null);
        } else {
            while (true) {
                if (current.getNext() == null) {
                    break;
                } else {
                    current = current.getNext();
                }
            }
            current.setNext(new mapNode(name, info, null));
        }
    }

    public String findInfo(String name) {
        mapNode current = start;
        while (true) {
            if (name.equals(current.getName())) {
                return current.getInfo();
            } else {
                current = current.getNext();
            }

        }
    }
}