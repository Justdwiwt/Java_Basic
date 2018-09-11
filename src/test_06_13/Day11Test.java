package test_06_13;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day11Test {
	public static void main(String[] args) {
		func6();
	}

	public static void func1() {
		String str = "I like beijing.";
		String[] t = str.split(" ");
		String tmp = "";
		for (int i = t.length - 1; i >= 0; i--) {
			tmp += t[i];
			if (i > 0)
				tmp += " ";
		}
		System.out.println(tmp);
	}

	public static void func2() {
		String a = "They are students.";
		String b = "aeiou";
		for (int i = 0; i < b.length(); i++)
			a = a.replaceAll("" + b.charAt(i), "");
		System.out.println(a);
	}

	public static void func3() {
		String str = "Abc/file.txt";
		System.out.println(str.substring(str.indexOf(".")));
	}

	public static void func4_1() {
		String str = "abcd12345ed125ss123456789";
		String[] temp = str.split("[a-z]");
		String max = temp[0];
		for (int i = 0; i < temp.length; i++)
			if (max.length() < temp[i].length()) {
				String t = "";
				t = max;
				max = temp[i];
				temp[i] = t;
			}
		System.out.println(max);
	}

	public static void func4_2() {
		String str = "abcd12345ed125ss123456789";
		String result = null;
		Pattern pt = Pattern.compile("\\d+");
		Matcher mt = pt.matcher(str);
		while (mt.find()) {
			String machered = mt.group(0);
			if (result == null || machered.length() > result.length())
				result = machered;
		}
		System.out.println(result);
	}

	public static void func5() {
		String a = "abc";
		String b = "def";
		StringBuilder sb = new StringBuilder();
		b = sb.append(b).reverse().toString();
		char[] key = new char[a.length() + b.length()];
		for (int i = 0, j = 0; i < key.length; i += 2)
			for (; j < a.length();) {
				key[i] = a.charAt(j);
				j++;
				break;
			}
		for (int i = 1, j = 0; i < key.length; i += 2)
			for (; j < b.length();) {
				key[i] = b.charAt(j);
				j++;
				break;
			}
		System.out.println(key);
	}

	public static void func6() {
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
