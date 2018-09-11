package test_05_17;

import java.util.Scanner;

public class Day05Test {
    public static void main(String[] args) {
        for (int xyz = 100; xyz < 1000; xyz++) {
            for (int abc = 100; abc < 1000; abc++) {
                boolean b1 = isSquare(xyz);
                boolean b2 = isSquare(abc);
                int ax = (abc / 100) * 10 + xyz / 100;
                int by = (abc / 10 % 10) * 10 + xyz / 10 % 10;
                int cz = (abc % 10) * 10 + xyz % 10;
                boolean b3 = isSquare(ax);
                boolean b4 = isSquare(by);
                boolean b5 = isSquare(cz);
                if (b1 && b2 && b3 && b4 && b5)
                    System.out.println(xyz + " " + abc);
            }
        }


        for (int i = 1; i < 3000; i++) {
            int a = isYz(i);
            if (i == isYz(a) && a <= i) {
                System.out.println(a + "," + i);
            }
        }

    }

    //亲密数
    private static int isYz(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                sum += i;
        return sum;
    }


    //完全平方数
    private static boolean isSquare(int num) {
        if (num < 0)
            return false;
        for (int i = 1; i <= num / 2; i++)
            if (i * i == num)
                return true;
        return false;
    }

    //1
    public static int add(int a, int b) {
        return a + b;
    }

    //2
    private static void prim(int m, int n) {
        if (m > n) {
            while (m % n != 0)
                n++;
            m /= n;
            prim(m, n);
            System.out.println(n + "*   ");
        }
    }

    //3
    private static int getSum(int n) {
        if (n == 1)
            return 1;
        return getSum(n) + getSum(n - 1);
    }

    //4
    @SuppressWarnings("LoopConditionNotUpdatedInsideLoop")
    private static int func4(int n) {
        int count = 0;
        while (n / 10 != 0)
            count++;
        return count;
    }

    //5
    private static boolean isPri(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    //9
    private static void getD() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 6 || num % 2 != 0) {
            System.out.println("error");
            getD();
        }
        for (int i = 3; i < num; i += 2)
            if (isPri(i) && isPri(num - i) && i <= (num - i))
                System.out.println(num + "=" + i + "+" + (num - i));
    }

    //11
    private static int fbn(int n) {
        if (n == 0)
            return -1;
        if (n == 1 || n == 2)
            return 1;
        else
            return fbn(n - 1) + fbn(n - 2);
    }
}
