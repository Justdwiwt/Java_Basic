package test_07_29;

import java.util.EmptyStackException;

public class StringArrayOfVerctor {
    private String[] v = new String[16];

    @SuppressWarnings("ObjectEqualsNull")
    private boolean empty() {
        return v[0].equals(null);
    }

    private String peek() {
        if (empty())
            throw new EmptyStackException();
        return v[v.length - 1];
    }

    @SuppressWarnings("StringEquality")
    private String pop() {
        String str = peek();
        for (int i = 0; i < v.length; i++)
            if (v[i] == str)
                v[i] = null;
        return str;
    }

    @SuppressWarnings({"ConstantConditions", "ObjectEqualsNull"})
    private void push(String str) {
        for (int i = 0; i < v.length; i++)
            if (v[i].equals(null)) {
                v[i] = str;
                break;
            }
    }

    @SuppressWarnings("StringEquality")
    private int search(String str) {
        for (int i = v.length - 1; i >= 0; i--)
            if (str == v[i] || str != null && str.equals(v[i]))
                return (v.length - i);
        return -1;
    }

    @SuppressWarnings("UnusedAssignment")
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (String aV : v) sb.append(aV).append(", ");
        String str = sb.toString();
        if (str.length() > 1)
            sb.substring(0, (str.length() - 2));
        return str += "]";
    }
}
