package test_05_07;

import java.util.Scanner;

public class SwitchTst {

    public static void main(String[] args) {
        System.out.println("请输入1-12");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }

}
