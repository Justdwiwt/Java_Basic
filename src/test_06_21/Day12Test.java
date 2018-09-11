package test_06_21;

import java.util.Scanner;

public class Day12Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int a = Integer.parseInt(str);
	}
}

class MyException1 extends Exception {
	public MyException1() {
		super();
	}

	public MyException1(String message) {
		super(message);
	}
}

class MyException2 extends RuntimeException {
	public MyException2() {
		super();
	}

	public MyException2(String message) {
		super(message);
	}
}