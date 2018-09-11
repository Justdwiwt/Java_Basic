package test_06_06;

import org.junit.Test;

import java.util.stream.IntStream;

public class StringTest {
    public static void main(String[] args) {
    }

    //输出目标字符在给定字符串中出现的每个位置
    @Test
    public void searchStr() {
        String str = "saacxdqjxxdozp14a0a66affasdawcf";
        char key = 'a';
        IntStream.range(0, str.length()).filter(i -> key == str.charAt(i)).forEach(System.out::println);
    }


    //统计一个字符串在另一个字符串中出现次数
    @Test
    public void countStr() {
        String str = "aacaadaab112saacacs99asc87aac8";
        String key = "aac";
        int count = 0;
        int index;
        while ((index = str.indexOf(key)) != -1) {
            count++;
            str = str.substring(index + key.length());
        }
        System.out.println(count);
    }


    @SuppressWarnings("StringConcatenationInLoop")
    @Test
    public void charStr() {
        String str = "String字符串";
        int num = 7;
        char[] ch = str.toCharArray();
        String copyStr = "";
        for (int i = 0; i < ch.length; i++) {
            copyStr += ch[i];
            if (copyStr.getBytes().length > num) {
                copyStr = new String(ch, 0, i);
                break;
            }
        }
        System.out.println(copyStr);
    }


    @SuppressWarnings("StringConcatenationInLoop")
    @Test
    public void byteStr() {
        String str = "String字符串";
        int num = 7;
        byte[] b = str.getBytes();
        String tmp = new String(b, 0, num);
        if (str.charAt(tmp.length() - 1) != tmp.charAt(tmp.length() - 1)) tmp = new String(b, 0, num - 1);
        System.out.println(tmp);
    }


    @Test
    public void indexOfStr() {
        String str = "saqc21e0dsq30q+-fe2";
        char ch = str.toCharArray()[0];
        int index = 0;
        while (index < str.length()) {
            index = str.indexOf(ch, index);
            if (index == -1) break;
            else {
                System.out.println(index);
                index++;
            }
        }
    }
}
