package test_07_21;

import java.util.LinkedList;
import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo1 {

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

		// ɸѡ��ͷ��ĸΪM���ַ���
		// s.filter(new Predicate<String>() {
		//
		// // ����ָ�����˹���
		// @Override
		// public boolean test(String t) {
		// return t.startsWith("M");
		// }
		// }).forEach(new Consumer<String>() {
		//
		// @Override
		// public void accept(String t) {
		// System.out.println(t);
		// }
		//
		// });

		s.filter(str -> str.startsWith("M")).forEach(str -> System.out.println(str));

	}

}
