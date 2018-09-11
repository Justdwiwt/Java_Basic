package test_07_21;

import java.util.LinkedList;
import java.util.List;
//import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo2 {

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

		// �����е�Ԫ�ض�ת��Ϊ��д
		// s.map(new Function<String, String>() {
		//
		// // ָ��ת������
		// @Override
		// public String apply(String t) {
		// return t.toUpperCase();
		// }
		// }).forEach(str -> System.out.println(str));

		s.map(str -> str.toUpperCase())
			.filter(str -> str.startsWith("A"))
			.forEach(str -> System.out.println(str));
	}

}
