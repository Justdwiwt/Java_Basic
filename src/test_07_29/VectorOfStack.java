package test_07_29;

import java.util.EmptyStackException;
import java.util.Vector;

public class VectorOfStack {
    private Vector<String> v = new Vector<String>();

    private boolean empty() {
        return v.isEmpty();
    }

    private String peek() {
        if (empty())
            throw new EmptyStackException();
        return v.get(v.size() - 1);
    }

    private String pop() {
        String str = peek();
        v.remove(peek());
        return str;
    }

    private void push(String str) {
        v.add(str);
    }

    private int search(String str) {
        // for (int i = (v.size() - 1); i >= 0; i--)
        // if (str == v.get(i) || str != null && str.equals(v.get(i)))
        // return (v.size() - i);
        // return -1;
        return v.lastIndexOf(str) == -1 ? -1 : v.size() - v.lastIndexOf(str);
    }
}
