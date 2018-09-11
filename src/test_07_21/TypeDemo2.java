package test_07_21;

//import java.util.List;

public class TypeDemo2 {

	public static void main(String[] args) {

		// Demo<String, Double> d1 = new Demo<>();
		// d1.set("abc");
		// Demo<Integer, List<String>> d2 = new Demo<>();
		// d2.set(6);
		// System.out.println(d2.get());

		// List<List<String>> list;
	}

}

// ���͵������ͱ�ʶ��һ��
// ϰ����ֻʹ�ô�д��ĸ����ʾ����
// T type
// E element
// K key
// V value
// R return/result
class Demo<T, E> {

	T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}