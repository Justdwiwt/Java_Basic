package test_05_09;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("输入十个数字");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "  ");
    }
}
