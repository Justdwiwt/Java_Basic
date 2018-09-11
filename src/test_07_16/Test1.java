package test_07_16;

public class Test1 {
    public static void main(String[] args) {
        boolean[] monkeys = new boolean[15];
        int count = 0;
        int index = 0;
        int left = 15;
        while (left > 1) {
            if (!monkeys[index]) {
                count++;
                if (count == 7) {
                    monkeys[index] = true;
                    count = 0;
                    left--;
                }
            }
            index++;
            if (index >= 15)
                index = 0;
        }
        for (int i = 0; i < monkeys.length; i++)
            if (!monkeys[i]) {
                System.out.println(i);
                break;
            }
    }
}
