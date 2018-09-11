package test_06_08;

import java.util.Scanner;

import org.junit.Test;

public class StringDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			if (str.length() % 8 != 0) {
				str += "00000000";
				while (str.length() >= 8) {
					System.out.println(str.substring(0, 8));
					str = str.substring(8);
				}
			}
		}

	}

	@Test
	public void substringTest() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			if (str.length() < 8) {
				String strtp = str.substring(0, str.length());
				String str0 = "";
				for (int i = 0; i < 8 - str.length(); i++)
					str0 += "0";
				System.out.println(strtp + str0);
			} else if (str.length() == 8) {
				System.out.println(str);
			} else if (str.length() > 8) {
				String strtp = str.substring(0, 8);
				System.out.println(strtp);
			}
		}
	}

}
