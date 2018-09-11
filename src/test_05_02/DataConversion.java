package test_05_02;

public class DataConversion {
    public static void main(String[] args) {

        // 相同数据类型进行操作
        int a = 10;
        int b = 12;
        int c = a + b;
        System.out.println(c);

        System.out.println("--------------");

        // 不同数据类型进行操作
        int a1 = 2;
        byte b1 = 3;
        // int c1 = a1 + b1;
        byte c1 = (byte) (a1 + b1);
        System.out.println(c1);

        System.out.println("--------------");

        @SuppressWarnings("unused")
        float f = 3.4f;
        @SuppressWarnings("unused")
        float f1 = (float) 3.4;

        System.out.println("--------------");

        byte bt1 = (byte) 130;
        System.out.println(bt1);
        /*
         * ( 0b ) 130 = 10000010 原码 10000010 反码 11111110 - 126补码
         */

    }
}
