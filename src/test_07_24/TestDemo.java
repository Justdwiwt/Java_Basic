package test_07_24;

import org.junit.Test;

public class TestDemo {

	public int add(int i, int j) {
		return i + j;
	}

	@Test
	public void m() {
		System.out.println(add(3, 8));
		System.out.println("m~~~");
	}

	@Test
	public void m2() {
		System.out.println("m2~~~");
	}

}
