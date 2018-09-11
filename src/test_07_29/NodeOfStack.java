package test_07_29;

import java.util.EmptyStackException;

public class NodeOfStack {
    private int size;
    private Node first;

    private void push(String str) {
        Node node = new Node(str, null);
        if (size != 0)
            node.next = this.first;
        this.first = node;
        size++;
    }

    private String peek() {
        if (size == 0)
            throw new EmptyStackException();
        return this.first.item;
    }

    private String pop() {
        String str = this.peek();
        this.first = this.first.next;
        size--;
        return str;
    }

    private boolean empty() {
        return size == 0;
    }

    @SuppressWarnings("StringEquality")
    private int search(String str) {
        Node node = this.first;
        for (int i = 0; i < size; i++) {
            String item = node.item;
            if (str == item || str != null && str.equals(item))
                return i + 1;
            node = node.next;
        }
        return -1;
    }

    private class Node {
        String item;
        Node next;

        private Node(String item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}

