package test_07_17;

import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrList list = new ArrList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("aaa");
        System.out.println(list);
    }
}

class ArrList {
    private String[] data;
    private int size;

    @SuppressWarnings("WeakerAccess")
    public ArrList() {
        data = new String[10];
    }

    public ArrList(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("非法参数异常");
        data = new String[initialCapacity];
    }

    private void grow() {
        if (data.length <= 1)
            data = Arrays.copyOf(data, data.length + 1);
        else
            data = Arrays.copyOf(data, data.length >> 1);
    }

    public void add(String str) {
        if (size >= data.length) this.grow();
        data[size++] = str;
    }

    public void out(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index:" + index + ", size:" + size);
    }

    @SuppressWarnings("Duplicates")
    public void add(int index, String str) {
        out(index);
        if (size >= data.length)
            grow();
//         for (int i = size - 1; i >= index; i--)
//             data[i + 1] = data[i];
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = str;
        size++;
    }

    @SuppressWarnings({"WeakerAccess", "StringEquality"})
    public int indexOf(String str) {
        for (int i = 0; i < size; i++)
            if (str == data[i] || data[i] != null && data[i].equals(str))
                return i;
        return -1;
    }

    public void remove(String str) {
        int index = this.indexOf(str);
        if (index != -1)
            this.remove(index);
    }

    @SuppressWarnings("WeakerAccess")
    public void remove(int index) {
        out(index);
//        for (int i = index; i < size - 1; i++)
//            data[i] = data[i + 1];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }

    public void set(int index, String str) {
        out(index);
        data[index] = str;
    }

    public String get(int index) {
        out(index);
        return data[index];
    }

    public boolean contains(String str) {
        return indexOf(str) != -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public void clear() {
        data = new String[10];
        size = 0;
    }

    @SuppressWarnings("UnusedAssignment")
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++)
            sb.append(data[i]).append(", ");
        String str = sb.toString();
        if (size > 0)
            str = str.substring(0, str.length() - 2);
        return str += "]";
    }
}