package test_07_19;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		v.addElement("a");
		v.addElement("b");
		v.add("c");
		v.add("d");

		// ��ȡ������
		Enumeration<String> e = v.elements();

		// �жϺ����Ƿ���Ԫ��
		while (e.hasMoreElements()) {

			// ���������Ԫ�أ�Ų��ָ������ȡ���Ԫ��
			String str = e.nextElement();
			System.out.println(str);

			// �ڵ��������в�������ɾԭ����
			// v.remove(str);
		}

		System.out.println(v);

	}

}
