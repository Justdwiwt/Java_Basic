package test_06_23;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayExam {
	private String[] data = new String[10];
	private int size = 0;

	public boolean empty() {
		return size == 0;
	}

	private String peek() {
		if (size <= 0)
			throw new EmptyStackException();
		return data[size - 1];
	}

	public String pop() {
		String str = peek();
		size--;
		return str;
	}

	public void push(String str) {
		if (data.length <= 1)
			data = Arrays.copyOf(data, data.length + 1);
		else
			data = Arrays.copyOf(data, data.length >> 1);
		data[size++] = str;
	}

	@SuppressWarnings("StringEquality")
	public int search(String str) {
		for (int i = size - 1; i >= 0; i--)
			if (str == data[i] || str != null && str.equals(data[i]))
				return size - i;
		return -1;
	}
}
