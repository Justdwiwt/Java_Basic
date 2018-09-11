package test_07_21;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();

		list.add("Grace");
		list.add("Alex");
		list.add("Alice");
		list.add("John");
		list.add("Mike");
		list.add("Jack");
		list.add("Rose");
		list.add("Mark");

		// ��ȡ����������
		Iterator<String> it = list.iterator();

		// �ж��Ƿ�����һ��Ԫ��
		while (it.hasNext()) {

			// Ų��ָ������ȡ���Ԫ��
			String str = it.next();
			System.out.println(str);

			// �Ƴ���ǰ�ڵ�����Ԫ��
			// it.remove();
			// �ڵ��������в�������ɾԭ����
			list.remove(str);
		}

		System.out.println(list);
	}

}
