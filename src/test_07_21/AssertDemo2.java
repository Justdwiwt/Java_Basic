package test_07_21;

public class AssertDemo2 {

	public static void main(String[] args) {

		int i = 5;

		i += 3;

		// �϶����һ����С��0��
		// assert i < 0;
		assert i < 0 : "���Ԥ��Ӧ��С��0����ʵ�ʽ����" + i;

		System.out.println(i);

	}

}
