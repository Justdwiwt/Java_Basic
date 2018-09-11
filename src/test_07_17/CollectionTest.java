package test_07_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.remove("3");
        System.out.println(c.size());

        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);
        for (Object o : list) System.out.println(o);
        System.out.println(list);
    }
}
