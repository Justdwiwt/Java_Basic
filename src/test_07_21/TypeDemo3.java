package test_07_21;

public class TypeDemo3 {

	public static void main(String[] args) {

		A a = new A();
		a.m("abc");
		a.m(new Double(3.5));
		a.m(true);
		a.m(new Object());

	}

}

class A {

	// ��ʾ����ǰ����������һ�������ķ���T
	// Ȼ������T���������˲���t
	public <T> void m(T t) {
		System.out.println(t.getClass());
	}

}