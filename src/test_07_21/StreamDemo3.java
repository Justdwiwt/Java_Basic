package test_07_21;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {

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

		Stream<String> s = list.stream();

		// �жϼ������Ƿ�����A��ͷ��Ԫ��
		// System.out.println(s.filter(str -> str.startsWith("A")).count() > 0);
		// System.out.println(s.anyMatch(str -> str.startsWith("A")));

		// �жϼ����е�����Ԫ���Ƿ�����A��ͷ
		System.out.println(s.allMatch(str -> str.startsWith("A")));
	}

}
