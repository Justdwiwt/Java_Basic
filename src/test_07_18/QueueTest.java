package test_07_18;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

@SuppressWarnings("unchecked")
public class QueueTest<Item> implements Iterable<Item> {

    public static void main(String[] args) {
        QueueTest q = new QueueTest();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
//        q.remove();
        System.out.println(q);
    }

    private Item[] a = (Item[]) new Object[1];
    private int head = 0;
    private int tail = 0;
    private int N;

    private boolean isEmpty() {
        return N == 0;
    }

    private int size() {
        return N;
    }

    private void add(Item item) {
        if (N == a.length)
            resize(a.length * 2);
        a[tail++] = item;
        if (tail == a.length)
            tail = 0;
        N++;
    }

    @SuppressWarnings("UnusedReturnValue")
    private Item remove() {
        Item item = a[head];
        a[head++] = null;
        N--;
        if (head == a.length)
            head = 0;
        if (N < a.length / 4)
            resize(a.length / 2);
        return item;
    }

    private void resize(int n) {
        Item[] items = (Item[]) new Object[n];
        for (int i = 0; i < N; i++) {
            items[i] = a[(i + head) % a.length];
        }
        a = items;
        head = 0;
        tail = N;
    }


    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    class QueueIterator implements Iterator<Item> {
        int i = 0;

        @Override
        public boolean hasNext() {
            return i < N;
        }

        @Override
        public Item next() {
            Item item = a[(i + head) % a.length];
            i++;
            return item;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(a);
    }

    @Override
    public void forEach(Consumer<? super Item> action) {
    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }
}
