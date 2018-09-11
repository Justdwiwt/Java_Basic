package test_07_27;

import java.util.Arrays;

public class VariableDemo {
    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4, 5));
    }

//    public static int add(int i, int j) {
//        return i + j;
//    }
//
//    public static int add(int[] arr) {
//        return Arrays.stream(arr).sum();
//    }

    // 可变参数允许传入的参数个数随意变化
    // 可变参数本质是数组
    public static int add(int... is) {
        return Arrays.stream(is).sum();
    }
}
