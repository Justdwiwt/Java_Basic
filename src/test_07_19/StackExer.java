package test_07_19;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackExer {

}

class LinkedStack {

	private int size;

	private Node first;

	public void push(String str) {

		Node node = new Node(str, null);

		// �ж��Ƿ���ͷһ���ڵ�
		if (size != 0) {

			node.next = this.first;

		}
		this.first = node;
		size++;

	}

	public String peek() {

		if (size == 0)
			throw new EmptyStackException();

		return this.first.item;

	}

	public String pop() {

		String str = this.peek();

		this.first = this.first.next;

		size--;

		return str;

	}

	public boolean empty() {
		return size == 0;
	}

	public int search(String str) {

		Node node = this.first;

		for (int i = 0; i < size; i++) {

			String item = node.item;
			if (str == item || str != null && str.equals(item)) {
				return i + 1;
			}
			node = node.next;
		}
		return -1;
	}

	// �����˴���ڵ����
	private class Node {

		String item;
		Node next;

		public Node(String item, Node next) {
			super();
			this.item = item;
			this.next = next;
		}

	}

}

class ArrayStack {

	private String[] data = new String[10]; // �洢����

	private int size; // ��¼����

	public void push(String str) {

		// �ж�����
		if (size >= data.length)
			data = Arrays.copyOf(data, data.length * 2);

		data[size++] = str;

	}

	public String peek() {

		// �ж�ջ�Ƿ�Ϊ��
		if (size == 0)
			throw new EmptyStackException();

		return data[size - 1];

	}

	public String pop() {

		// ��ȡջ��Ԫ��
		String str = this.peek();

		size--;

		return str;

	}

	public boolean empty() {
		return size == 0;
	}

	public int search(String str) {

		for (int i = size - 1; i >= 0; i--) {

			if (str == data[i] || str != null && str.equals(data[i])) {
				return size - i;
			}

		}

		return -1;

	}

}