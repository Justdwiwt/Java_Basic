package test_07_29;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class ListOfStack {
    private List<String> list = new ArrayList<>();

    private boolean empty() {
        return list.isEmpty();
    }

    private String peek() {
        if (empty())
            throw new EmptyStackException();
        return list.get(list.size() - 1);
    }

    private String pop() {
        String str = peek();
        list.remove(peek());
        return str;
    }

    private void push(String str) {
        list.add(str);
    }

    private int search(String str) {
        // for (int i = (v.size() - 1); i >= 0; i--)
        // if (str == v.get(i) || str != null && str.equals(v.get(i)))
        // return (v.size() - i);
        // return -1;
        return list.lastIndexOf(str) == -1 ? -1 : list.size() - list.lastIndexOf(str);
    }
}
