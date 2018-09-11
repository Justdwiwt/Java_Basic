package test_06_12;

public class Test {
	public static void main(String[] args) {
		String str = "111 222 333";
		reString(str);
	}

	// 逆序字串不改变单词
	public static void reString(String str) {
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
			if (i > 0)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
