package test_05_07;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {
        System.out.println("请输入1-7");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }

}
