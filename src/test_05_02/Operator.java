package test_05_02;

public class Operator {
    public static void main(String[] args) {

        // 算数运算符
        double a = 3;
        double b = 4;
        // +
        System.out.println(a + b);
        System.out.println("--------------");
        // -
        System.out.println(a - b);
        System.out.println("--------------");
        // *
        System.out.println(a * b);
        System.out.println("--------------");
        // / 只要数据中有小数类型，结果就是小数类型
        System.out.println(a / b);
        System.out.println("--------------");
        // %
        System.out.println(a % b);
        System.out.println("--------------");

        // ++
        System.out.println(a++);
        System.out.println("--------------");
        // --
        System.out.println(--b);
        System.out.println("--------------");
        int a1 = 3;
        int b1 = 4;
        int num = (a1++) + (b1--) + (++b1);
        System.out.println(num);
        System.out.println("--------------");

        // 赋值运算符
        // =
        int c1 = 5;
        // +=
        c1 += 6;
        System.out.println(c1);
        System.out.println("--------------");
        // -=
        c1 -= 7;
        System.out.println(c1);
        System.out.println("--------------");
        // *=
        c1 *= 8;
        System.out.println(c1);
        System.out.println("--------------");
        // /=
        c1 /= 9;
        System.out.println(c1);
        System.out.println("--------------");
        // %=
        c1 %= 10;
        System.out.println(c1);
        System.out.println("--------------");

        // 比较运算符
        // ==, <, >, <=, >=, !=
        int c = 3;
        @SuppressWarnings("unused")
        int d = 4;
        System.out.println(a == b);
        System.out.println("--------------");
        System.out.println(a > b);
        System.out.println("--------------");
        System.out.println(a < b);
        System.out.println("--------------");
        System.out.println(a <= b);
        System.out.println("--------------");
        System.out.println(a >= b);
        System.out.println("--------------");
        System.out.println(a != b);
        System.out.println("--------------");

        // 逻辑运算符
        // &&, ||, !, ^
        System.out.println((a == b) || (a == c));
        System.out.println("--------------");
        System.out.println((a > b) && (b < c));
        System.out.println("--------------");
        System.out.println((a < b) && (a > c));
        System.out.println("--------------");
        System.out.println((a <= b) || (a >= c));
        System.out.println("--------------");
        System.out.println((a >= b) || (b >= c));
        System.out.println("--------------");
        System.out.println((a != b) && (b != c));
        System.out.println("--------------");

    }
}
