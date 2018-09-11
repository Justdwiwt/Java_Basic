package test_06_11;

public class PatternTest {
	public static void main(String[] args) {
		String str = "10.2";
		System.out.println(str.matches("\\d+\\.\\d+"));
		String pwd = "1234zxc";
		System.out.println(pwd.matches("(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,18}"));
		System.out.println(pwd.matches("\\d{2,}?[a-zA-Z]{2,}?{6,18}"));
		System.out.println(isPassword(pwd));
	}

	public static boolean isPassword(String str) {
		if (str == null)
			return false;
		if (!str.matches("[a-zA-Z0-9]{6,18}"))
			return false;
		int count = 0;
		if (str.matches(".*\\d.*"))
			count++;
		if (str.matches(".*[a-zA-Z].*"))
			count++;
		if (str.matches(".*_.*"))
			count++;
		return count >= 2;
	}
}
