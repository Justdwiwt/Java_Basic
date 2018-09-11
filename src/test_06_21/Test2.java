package test_06_21;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(ma());
	}

	public static int ma() {
		int b = 0;
		try {
			int n = 100;
			return n / b;
		} catch (Exception e) {
			return 10;
		} finally {
			return 100;
		}
	}
}
