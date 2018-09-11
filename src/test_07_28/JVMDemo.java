package test_07_28;

public class JVMDemo {
    private static int count = 0;

    public static void main(String[] args) {

    }

    public static int add(int n) {
        System.out.println(count++);
        if (n == 1) return 1;
        return n + add(--n);
    }
}
