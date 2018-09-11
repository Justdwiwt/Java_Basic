package test_07_16;

import org.junit.Test;

public class Week1 {
    public static void main(String[] args) {
        Week1 w = new Week1();
        int[] tmp = new int[3];
        tmp[0] = w.bin(5);
        tmp[1] = w.bin(-5);
        tmp[2] = w.bin(1);
        for (int i = 0; i < 3; i++)
            System.out.println(tmp[i]);
    }

    // 请在空白处填写对应的符号，使println(a);为1
    @SuppressWarnings("ConstantConditions")
    @Test
    public void test1() {
        int a = 1;
        System.out.println(a == 1 || a > 1 || a++ > 1);
        System.out.println(a);
    }

    // 请在空白处填写对应的符号，使println(b);为2
    @SuppressWarnings("ConstantConditions")
    @Test
    public void test2() {
        int b = 1;
        System.out.println(b > 1 ? b == 1 : b++ > 1);
        System.out.println(b);
    }

    // 请在空白处填写对应的符号，使println(c);为3
    @SuppressWarnings("ConstantConditions")
    @Test
    public void test3() {
        int c = 1;
        System.out.println(c == 1 | ++c > 1 | c++ > 1);
        System.out.println(c);
    }

    //求二进制中1的个数,输入一个整数，输出该数二进制表示中1的个数,其中负数用补码表示
    private int bin(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '1')
                count++;
        return count;
    }
}
