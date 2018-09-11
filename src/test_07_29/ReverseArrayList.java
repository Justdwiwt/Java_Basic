package test_07_29;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
    @SuppressWarnings("unchecked")
    private static List reverseList(List list) {
        List reList = new ArrayList();
        for (int i = list.size() - 1; i >= 0; i--)
            reList.add(list.get(i));
        return reList;
    }
}
