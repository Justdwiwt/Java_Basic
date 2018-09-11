package test_06_26;

import java.util.EmptyStackException;

public class Test {
	public static void main(String[] args) {
		byte b = 'a';
		short s = 2 << 5;
		float f = 3.2f / 1;
	}

	private String[] v = new String[16];

	public Test() {
	}

	public boolean empty() {
		return v[0].equals(null);
	}

	public String peek() {
		if (empty())
			throw new EmptyStackException();
		return v[v.length - 1];
	}

	public String pop() {
		String str = peek();
		for (int i = 0; i < v.length; i++)
			if (v[i] == str)
				v[i] = null;
		return str;
	}

	public void push(String str) {
		for (int i = 0; i < v.length; i++)
			if (v[i].equals(null)) {
				v[i] = str;
				break;
			}
	}

	public int search(String str) {
		for (int i = v.length - 1; i >= 0; i--)
			if (str == v[i] || str != null && str.equals(v[i]))
				return (v.length - i);
		return -1;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < v.length; i++)
			sb.append(v[i]).append(", ");
		String str = sb.toString();
		if (str.length() > 1)
			sb.substring(0, (str.length() - 2));
		return str += "]";
	}
}
