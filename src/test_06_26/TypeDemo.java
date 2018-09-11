package test_06_26;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo {
	public static void main(String[] args) {
		List<Integer> in = new ArrayList<>();
		List<Double> db = new ArrayList<>();
	}

	// 接受数字类型的集合参数并遍历元素
	// ?通配符
	// ? extends Number 可以接受Number类及其子类
	// ? extends 类/接口或者/子类/子接口对象
	// 限定泛型的上限
	public static void m(List<? extends Number> nubmers) {
	}

	// 接受String或其父类的集合参数
	// ? extends String 可以接受String类或父类
	// 限定泛型的下限
	public static void n(List<? super String> numbers) {
	}
	
}