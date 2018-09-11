package test_05_09;

import java.util.Scanner;

public class CircularTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(func19());
//		func12();
    }

    // 输入一个整数判断是否是质数
    public static boolean func19() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int n = sc.nextInt();
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    @SuppressWarnings("resource")
    public static void func3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入三个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        a = a > b ? a : b;
        a = a > c ? a : c;
        System.out.println(a);
    }

    public static void func14() {
        int a, b, c, d;
        for (int i = 1000; i < 9999; i++) {
            a = i / 1000;
            b = i / 100 % 10;
            c = i / 10 % 10;
            d = i % 10;

            int ab = a * 10 + b;
            int cd = c * 10 + d;
            int ad = ab + cd;
            if (ad * ad == i)
                System.out.println(i);
        }
    }

    public static void func12() {
        int x;
        int y;
        int z;
        for (int i = 0; i <= 3; i++) {
            x = 5 * i;
            y = 40 - 8 * i;
            z = 60 + 3 * i;
            System.out.println("x:" + x + '\t' + "y:" + y + '\t' + "z:" + z);
        }
    }

    public static void func13() {
        int x;
        int y;
        int z;
        for (int i = 0; i <= 1; i++) {
            x = 5 * i;
            y = 36 / 5 - 7 * i;
            z = 36 + 2 * i - 36 / 5;
            System.out.println("x:" + x + '\t' + "y:" + y + '\t' + "z:" + z);
        }
    }

    @SuppressWarnings("resource")
    public static void func18() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int num = sc.nextInt();
        while ((num / 10) != 0) {
            sum += num % 10;
            num = num / 10;
        }
        sum += num;
        System.out.print("各位数字的和为：" + sum);
    }

    @SuppressWarnings("resource")
    public static void func15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= num - i - 1; j++)
                System.out.print(" ");
            for (int j = 0; j <= i * 2; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
