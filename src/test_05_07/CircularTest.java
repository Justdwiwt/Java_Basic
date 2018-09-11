package test_05_07;

public class CircularTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        func1();
        System.out.println("---------");
        func2();
        System.out.println("---------");
        func3();
        System.out.println("---------");
        func4();
        System.out.println("---------");
        func5();
        System.out.println("---------");
        System.out.println(func6(5));
        System.out.println("---------");
        func7(100);
        System.out.println("---------");
        System.out.println(func8(100));
        System.out.println("---------");
        func9();
        System.out.println("---------");
        func10();
    }

    // 控制台输出数据1-10
    public static void func1() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }

    // 控制台输出数据10-1
    public static void func2() {
        for (int i = 10; i > 0; i--)
            System.out.println(i);
    }

    // 求出1-10之间数据之和
    public static void func3() {
        int data = 0;
        for (int i = 1; i <= 10; i++)
            data += i;
        System.out.println(data);
    }

    // 求出1-100之间偶数和
    public static void func4() {
        int data = 0;
        for (int i = 1; i <= 100; i++)
            if (i % 2 == 0)
                data += i;
        System.out.println(data);
    }

    // 求出1-100之间奇数和
    public static void func5() {
        int data = 0;
        for (int i = 1; i <= 100; i++)
            if (i % 2 != 0)
                data += i;
        System.out.println(data);
    }

    // 求5的阶乘
    public static long func6(int n) {
        if (n == 0)
            return 1l;
        return n * func6(n - 1);
    }

    // 在控制台输出所有的”水仙花数”
    public static int func7(int n) {
        int number;
        for (number = n; number <= 999; number++) {
            int gewei = number % 10;
            int shiwei = number / 10 % 10;
            int baiwei = number / 100 % 10;
            if (gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei == number)
                System.out.println("ˮ�ɻ����ǣ�" + number);
        }
        return number;
    }

    // 统计”水仙花数”共有多少个
    public static int func8(int n) {
        int count = 0;
        for (int number = n; number <= 999; number++) {
            int gewei = number % 10;
            int shiwei = number / 10 % 10;
            int baiwei = number / 100 % 10;
            if (gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei == number)
                count++;
        }
        return count;
    }

    // 请在控制台输出满足如下条件的五位数个位等于万位十位等于千位个位+十位+千位+万位=百位
    public static void func9() {
        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = (i % 100) / 10;
            int bai = (i % 1000) / 100;
            int qian = (i % 10000) / 1000;
            int wan = i / 10000;
            if (ge == wan && shi == qian && (ge + shi + wan + qian) == bai)
                System.out.println(i);
        }
    }

    //请统计1-1000之间同时满足如下条件的数据有多少个：对3整除余2对5整除余3对7整除余2
    public static void func10() {
        int count = 0;
        for (int num = 1; num <= 1000; num++)
            if (num % 3 == 2 && num % 5 == 3 && num % 7 == 2)
                count++;
        System.out.println(count);
    }
}
