package test_06_04;

import org.junit.Test;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
    }

    @Test
    public void func1() {
        String str = "1, 2, 3, 'A', 'B', 'C', 'a', 'b', 'c', '^','#'";
        char[] ch = str.toCharArray();
        int azCount = 0;
        int AZCount = 0;
        int nCount = 0;
        int otherCount = 0;
        for (char aCh : ch)
            if (aCh >= 97 && aCh <= 121) azCount++;
            else if (aCh >= 65 && aCh <= 89) AZCount++;
            else if (aCh >= 48 && aCh <= 57) nCount++;
            else otherCount++;
        System.out.println("a-z:" + azCount + " " + "A-Z:" + AZCount + " " + "number:" + nCount + " " + "Other:" + otherCount);
    }

    @Test
    public void func2() {
        String str = "1, 2, 3, 'A', 'B', 'C', 'a', 'b', 'c', '^','#'";
        char[] ch = str.toCharArray();
        int sum = 0;
        for (char aCh : ch)
            if (aCh >= '0' && aCh <= '9')
                sum += (aCh - 48);
        System.out.println(sum);
    }

    @Test
    public void func3() {
        String str = "1,2,3,6,5,4,a,b,c,A,B,C,$,%,^";
        str.trim();
        char[] ch = str.toCharArray();
        int[] arr = new int[ch.length];
        int index = 0;
        for (char aCh : ch)
            if (aCh >= '0' && aCh <= '9') {
                arr[index] = aCh - '0';
                index++;
            }
        arr = Arrays.copyOf(arr, index);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isReverse(String str) {
        if (str == null)
            return false;
        for (int i = 0; i <= str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        return true;
    }

    @Test
    public void func4() {
        String str = "1,2,3,6,5,4,a,b,c,A,B,C,$,%,^";
        String str1 = "12321";
        System.out.println(isReverse(str));
        System.out.println(isReverse(str1));
    }
}
