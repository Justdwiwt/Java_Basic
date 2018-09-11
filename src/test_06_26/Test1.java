package test_06_26;

import java.util.EmptyStackException;
import java.util.Vector;

public class Test1 {
	public static void main(String[] args) {
	}

	private Vector<String> v = new Vector<String>();

	public Test1() {
	}

	public boolean empty() {
		return v.isEmpty();
	}

	public String peek() {
		if (empty())
			throw new EmptyStackException();
		return v.get(v.size() - 1);
	}

	public String pop() {
		String str = peek();
		v.remove(peek());
		return str;
	}

	public void push(String str) {
		v.add(str);
	}

	public int search(String str) {
		// for (int i = (v.size() - 1); i >= 0; i--)
		// if (str == v.get(i) || str != null && str.equals(v.get(i)))
		// return (v.size() - i);
		// return -1;
		return v.lastIndexOf(str) == -1 ? -1 : v.size() - v.lastIndexOf(str);
	}
}
