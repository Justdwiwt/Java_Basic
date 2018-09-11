package test_05_15;

public class MethodOverLoad {

    public static void main(String[] args) {
        System.out.println(recursive(5));
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static double getSum(int a, double b) {
        return a + b;
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static int recursive(int num) {
        if (num == 1)
            return 1;
        return num + recursive(num - 1);
    }

    public static int reX(int n) {
        if (n == 1)
            return 1;
        return n * reX(n - 1);
    }
}
