package test_06_12;

public class PatternDemo {
	public static void main(String[] args) {
		String str = "ttt yyy rrr";
		System.out.println(str.replaceAll("(ttt)(.*)(rrr)", "$3$2$1"));

		String str1 = "wwwwzzzzzxxxxxcccc";
		System.out.println(str1.replaceAll("(.)\\1+", "$1"));

		String str2 = "aaabbbccdd";
		double length = str2.length();
		str2 = str2.replaceAll("(.)\\1+", "$1");
		System.out.println(length / str2.length());

	}
}
