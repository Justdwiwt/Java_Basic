package test_07_21;

import java.util.Collections;
//import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {

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

		// Collections.sort(list);

		// ��Ԫ�ذ��ս�������
		// Collections.reverse(list);

		// ��������ĸ��˳�������������
		// �ڶ���������ʾ�Ƚ���������ָ���ȽϵĹ���
		// Collections.sort(list, new Comparator<String>() {
		//
		// // ���ȽϹ���д��compare������
		// // �������ֵ����������ô�������ʱ��Ὣo1�ŵ�o2�ĺ��
		// // �������ֵ�Ǹ�������ô�������ʱ��Ὣo1�ŵ�o2��ǰ��
		// @Override
		// public int compare(String o1, String o2) {
		// return o1.charAt(0) - o2.charAt(0);
		// }
		// });

		Collections.sort(list, (s1, s2) -> s1.charAt(0) - s2.charAt(0));

		System.out.println(list);

	}

}
