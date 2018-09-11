package test_07_29;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StringArrayOfStack {
    private String[] data = new String[10];
    private int size;

    private void push(String str) {
        if (size >= data.length)
            data = Arrays.copyOf(data, data.length * 2);
        data[size++] = str;
    }

    private String peek() {
        if (size == 0)
            throw new EmptyStackException();
        return data[size - 1];
    }

    private String pop() {
        String str = this.peek();
        size--;
        return str;
    }

    private boolean empty() {
        return size == 0;
    }

    @SuppressWarnings("StringEquality")
    private int search(String str) {
        for (int i = size - 1; i >= 0; i--)
            if (str == data[i] || str != null && str.equals(data[i]))
                return size - i;
        return -1;
    }
}
