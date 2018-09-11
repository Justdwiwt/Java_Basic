package test_06_22;

import java.util.Arrays;

public class ArrayListExam {
	public static void main(String[] args) {
		ArrayListExam al = new ArrayListExam();
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al);
	}

	private String[] data;

	private int size = 0;

	private ArrayListExam() {
		data = new String[10];
	}

	public ArrayListExam(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("Illegal Capacity:" + capacity);
	}

	private void grow() {
		if (data.length <= 1)
			data = Arrays.copyOf(data, data.length + 1);
		else
			data = Arrays.copyOf(data, data.length >> 1);
	}

	public void add(String str) {
		if (size >= data.length)
			grow();
		// data[size] = str;
		// size++;
		data[size++] = str;
	}

	public void out(int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", size:" + size);
	}

	@SuppressWarnings("Duplicates")
	public void add(int index, String str) {
		out(index);
		if (size >= data.length)
			grow();
		// for (int i = size - 1; i >= index; i--)
		// data[i + 1] = data[i];
		System.arraycopy(data, index, data, index + 1, size - index);
		data[index] = str;
		size++;
	}

	public void remove(String str) {
		int index = indexOf(str);
		if (index != -1)
			remove(index);
	}

	private void remove(int index) {
		out(index);
		// for (int i = index; i < size - 1; i++)
		// data[i] = data[i + 1];
		System.arraycopy(data, index + 1, data, index, size - index - 1);
		size--;
	}

	public String get(int index) {
		out(index);
		return data[index];
	}

	public void set(int index, String str) {
		out(index);
		data[index] = str;
	}

	@SuppressWarnings("StringEquality")
	private int indexOf(String str) {
		for (int i = 0; i < size; i++) {
			if (str == data[i] || data[i] != null && data[i].equals(str))
				return i;
		}
		return -1;
	}

	public boolean contains(String str) {
		return indexOf(str) != -1;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	@SuppressWarnings("UnusedAssignment")
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++)
			sb.append(data[i]).append(", ");
		String str = sb.toString();
		if (str.length() > 1)
			sb.substring(0, (str.length() - 2));
		return str += "]";
	}
}
