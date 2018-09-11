package test_05_08;

public class Test {
    /*
     * 输出如下图形： ***** ***** ***** ***** *****
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // for (int i = 6; i > 0; i--) {
        // for (int j = 1; j <= 5; j++)
        // System.out.print("*");
        // System.out.println();
        // }
        nn(3);
    }

    // 9*9乘法表
    public static void nn(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            System.out.println();
        }
    }
}
