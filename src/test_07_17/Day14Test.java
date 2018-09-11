package test_07_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Day14Test {
    public static void main(String[] args) {
//        Map map = new HashMap();
//        MyKey key1 = new MyKey(10);
//        map.put(key1, new MyValue("abc"));
//        map.put(new MyKey(10), new MyValue("cde"));
//        System.out.println(map.get(key1));
//        System.out.println(map.size());
        List<String> list = new ArrayList<String>();
        list.add("科特迪瓦");
        list.add("阿根廷");
        list.add("澳大利亚");
        list.add("塞尔维亚");
        list.add("荷兰");
        list.add("尼日利亚");
        list.add("日本");
        list.add("美国");
        list.add("中国");
        list.add("新西兰");
        list.add("巴西");
        list.add("比利时");
        list.add("韩国");
        list.add("喀麦隆");
        list.add("洪都拉斯");
        list.add("意大利");
        Random a = new Random();
        for (int i = 0; i < 4; i++) {
            System.out.println("第" + (i + 1) + "组是：");
            for (int j = 0; j < 4; j++) {
                String s = list.get(a.nextInt(list.size()));
//                String s = list.get((int) Math.random() * 16);
                System.out.print(s + " ");
                list.remove(s);
            }
            System.out.println();
        }
    }
}

@SuppressWarnings("FieldCanBeLocal")
class MyKey {
    private int KeyValue;

    public MyKey() {
    }

    public MyKey(int value) {
        this.KeyValue = value;
    }
}

class MyValue {
    private String value;

    public MyValue() {
    }

    public MyValue(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
