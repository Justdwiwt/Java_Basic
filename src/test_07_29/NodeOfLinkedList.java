package test_07_29;

public class NodeOfLinkedList {
    private int size;
    private Node first;
    private Node last;

    private void add(String str) {
        Node node = new Node(this.last, str, null);
        if (size == 0)
            this.first = node;
        else
            this.last.next = node;
        this.last = node;
        size++;
    }

    private Node getNode(int index) {
        Node no = this.first;
        for (int i = 1; i <= index; i++)
            no = no.next;
        return no;
    }

    private void add(int index, String str) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException();
        if (index == size) {
            add(str);
            return;
        }
        Node no = new Node(null, str, null);
        if (index == 0) {
            no.next = this.first;
            this.first.prev = no;
            this.first = no;
        } else {
            Node node = getNode(index);
            node.prev.next = no;
            no.prev = node.prev;
            node.next = node;
            node.prev = no;
        }
        size++;
    }

    private void out(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
    }

    @SuppressWarnings("Duplicates")
    private void remove(int index) {
        this.out(index);
        if (size == 1) {
            this.first = null;
            this.last = null;
            size--;
            return;
        }
        if (index == 0) {
            this.first = this.first.next;
            this.first.prev = null;
        } else if (index == size - 1) {
            this.last = this.last.prev;
            this.last.next = null;
        } else {
            Node node = this.getNode(index);
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        size--;
    }

    @SuppressWarnings("StringEquality")
    private int indexOf(String str) {
        Node node = this.first;
        for (int i = 1; i < size; i++) {
            String item = node.item;
            if (str == item || str != null && str.equals(item))
                return i;
            node = node.next;
        }
        return -1;
    }

    private void remove(String str) {
        int index = indexOf(str);
        if (index != -1)
            this.remove(index);
    }

    private void set(int index, String str) {
        this.out(index);
        Node node = this.getNode(index);
        node.item = str;
    }

    private String get(int index) {
        this.out(index);
        return this.getNode(index).item;
    }

    private boolean contains(String str) {
        return this.indexOf(str) != -1;
    }

    private NodeOfLinkedList reverse() {
        NodeOfLinkedList list = new NodeOfLinkedList();
        Node node = this.last;
        for (int i = size - 1; i >= 0; i--) {
            list.add(node.item);
            node = node.prev;
        }
        return list;
    }

    @SuppressWarnings("UnusedAssignment")
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node node = this.first;
        for (int i = 0; i < size; i++) {
            sb.append(node.item).append(", ");
            node = node.next;
        }
        String str = sb.toString();
        if (size != 0)
            str = str.substring(0, str.length() - 2);
        return str += "]";
    }

    private class Node {
        Node prev;
        String item;
        Node next;

        private Node(Node prev, String item, Node next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}
