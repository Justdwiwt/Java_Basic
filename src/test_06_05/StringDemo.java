package test_06_05;

import org.junit.Test;

public class StringDemo {
    public static void main(String[] args) {
        String str = "zxcvb12345zxc123123bbzzx";
    }

    //统计字符串各字符次数
    @Test
    public void getStrCount() {
        String str = "zxcvb12345zxc123123bbzzx";
        boolean flag[] = new boolean[str.length()];
        for (int i = 0; i < flag.length; i++)
            if (!flag[i]) {
                char c = str.charAt(i);
                int count = 1;
                for (int j = i + 1; j < flag.length; j++)
                    if (c == str.charAt(j)) {
                        count++;
                        flag[j] = true;
                    }
                System.out.println(c + " " + count);
            }
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    public void equalsTest() {
        String str1 = "qw";
        String str2 = "xz";
        System.out.println(str1.equals(str2));
    }
}
