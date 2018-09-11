package test_05_08;

public class WhileTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        func1();
        System.out.println("--------");
        func2();
        System.out.println("--------");
    }

    // 输出1-10
    public static void func1() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // 房子：120平 120w 每月工资节余：4k
    public static void func2() {
        int hp = 360000;
        int gz = 8000;
        int money = 0;
        int count = 0;
        while (true) {
            money += gz;
            count++;
            if (money >= hp)
                break;
        }
        System.out.println(count / 12);
    }

}
