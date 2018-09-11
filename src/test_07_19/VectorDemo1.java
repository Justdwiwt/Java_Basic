package test_07_19;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {

		// ָ����ʼ����Ϊ5��ÿ������3��
		// Vector<String> v = new Vector<String>(5, 3);
		Vector<String> v = new Vector<String>();

		// ��ȡ����������
		System.out.println(v.capacity());

		for (int i = 0; i < 25; i++) {
			v.add("a");
		}
		System.out.println(v.capacity());

	}

}
