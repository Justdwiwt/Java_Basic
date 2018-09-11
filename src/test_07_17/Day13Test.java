package test_07_17;

import java.util.ArrayList;
import java.util.List;

public class Day13Test {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(reverseList(list));
//        Queue queue = new LinkedList();
        int i = 5;
//        i += i *= ~i++;
        System.out.print(i += i *= ~i++);
    }

    @SuppressWarnings("unchecked")
    private static List reverseList(List list) {
        List reList = new ArrayList();
        for (int i = list.size() - 1; i >= 0; i--)
            reList.add(list.get(i));
        return reList;
    }
}
