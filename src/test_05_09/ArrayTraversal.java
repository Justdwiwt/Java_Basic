package test_05_09;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        /*
         * for(数据类型 变量名: 遍历名) {循环体}
         */
        for (int i : arr)
            System.out.println(i);
    }
}
