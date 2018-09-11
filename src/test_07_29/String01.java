package test_07_29;

@SuppressWarnings("Duplicates")
public class String01 {
    private static void func6() {
        String str = "111101111";
        int count = 1;
        int max = 1;
        for (int i = 1; i < str.length(); i++) {
            count++;
            if (str.charAt(i) == str.charAt(i - 1))
                count = 1;
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
