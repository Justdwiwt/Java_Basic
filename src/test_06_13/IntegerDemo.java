package test_06_13;

public class IntegerDemo {
	public static void main(String[] args) {
		int i = 1;
		Integer in = new Integer(i);
		System.out.println(in);
		Integer i1 = 220;
		Integer i2 = 220;
		System.out.println(i1 == i2);
		System.out.println(new Integer(200) == 200);

		Integer it1 = new Integer("123");
		int it = it1;
		System.out.println(it);
		
		int j = Integer.parseInt("123");
		System.out.println(j);
	}
}
