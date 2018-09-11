package test_07_29;

@SuppressWarnings("Duplicates")
public class CountString {
    public static void main(String[] args) {
        // 统计一个字符串中各个字符出现的次数
        String str5 = "zzzaaaassd--11==++??sa111123sx";
        int length = str5.length();
        while (length > 0) {
            char key = str5.charAt(0);
            String s = "";
            if (key == '+' || key == '-' || key == '?')
                s = "\\" + key;
            else
                s += key;
            str5 = str5.replaceAll(s, "");
            System.out.println(key + ":" + (length - str5.length()));
            length = str5.length();
        }
    }

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
}
