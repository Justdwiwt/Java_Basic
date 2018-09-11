package test_06_11;

import org.junit.Test;
import java.util.Arrays;
import java.util.Scanner;

public class Day10Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		magicCoin(n);
	}

	public static void magicCoin(long n) {
		if (n == 0)
			return;
		else if (n % 2 == 1) {
			magicCoin((n - 1) / 2);
			System.out.print("1");
		} else {
			magicCoin((n - 2) / 2);
			System.out.print("2");
		}
	}

//	@Test
	public void getNum() {
		String str = "ABC137GMNQQ2049PN5FFF";
		String temp = "";
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				temp += str.charAt(i);
		char[] t = temp.toCharArray();
		Arrays.sort(t);
		System.out.println(t);
	}
}
