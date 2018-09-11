package test_07_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SuppressWarnings("Duplicates")
public class RandomFootballTeam {
    public static void main(String[] args) {
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

