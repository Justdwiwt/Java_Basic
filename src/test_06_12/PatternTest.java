package test_06_12;

public class PatternTest {
	public static void main(String[] args) {
		String str = "ababsdf";

		// 匹配"abab";
		// \\n代表编号为n的捕获组的内容
		System.out.println(str.matches(".*(ab).*\\1.*"));
		// 捕获组编号从遇到(开始编号
		// ((A(B(CD)E))F)(G)
		// 1.(A(B(CD)E))F
		// 2.A(B(CD)E)
		// 3.B(CD)E
		// 4.CD
		// 5.G

		String str1 = "aaa";
		System.out.println(str1.matches("(.)\\1+"));

		String str2 = "abab";
		System.out.println(str2.matches("(..)\\1"));

		String str3 = "aabb";
		System.out.println(str3.matches("(.)\\1(.)\\2"));

		// 匹配邮箱
		String str4 = "123_a-bcABC@163.cn";
		System.out.println(str4.matches("[a-zA-Z0-9_-]{6,18}+@[a-zA-Z0-9_-]{1,10}+(\\.[a-zA-Z0-9_-]+)+"));
		System.out.println(str4.matches("[\\w\\-]{6,18}@[a-z0-9]{1,10}\\.cn"));

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
}
