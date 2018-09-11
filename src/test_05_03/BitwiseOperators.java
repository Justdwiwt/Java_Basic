package test_05_03;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        /*
         * 补码: a = 00000000 00000000 00000000 00000100 b = 00000000 00000000 00000000
         * 00000101
         *
         * &: 遇0则0 00000000 00000000 00000000 00000100
         *
         * |: 遇1则1 00000000 00000000 00000000 00000101
         *
         * ^: 同0异1 00000000 00000000 00000000 00000001
         *
         * ~: 所有位按位取反 ---> 补码 ---> 减1 ---> 符号位不变，其余位取反
         */

        // 按位与
        System.out.println(a & b);
        System.out.println("---------");

        // 按位或
        System.out.println(a | b);
        System.out.println("---------");

        // 按位取反
        System.out.println(a ^ b);
        System.out.println(a ^ b ^ b);
        System.out.println(a ^ b ^ a);
        int c = a ^ b ^ a;
        int d = a ^ b ^ b;
        System.out.println(c);
        System.out.println(d);
        System.out.println("---------");

        // ��λȡ��
        System.out.println(~a);
        System.out.println(~b);
        System.out.println("---------");
//		Integer ig = 0;
    }
}
