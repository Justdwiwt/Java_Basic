package test_07_19;

public class LinkedListExer {

	public static void main(String[] args) {

		LinkList list = new LinkList();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		// list.add(0,"e");
		// list.add(2,"f");

		// list.remove(0);
		// list.remove(3);
		list.remove(1);

		System.out.println(list);

	}

}

class LinkList {

	private int size; // Ԫ�ظ���

	private Node first; // ��һ���ڵ�

	private Node last; // ���һ���ڵ�

	public void add(String str) {

		// ����һ���ڵ�洢���Ԫ��
		Node node = new Node(this.last, str, null);

		// �ж��Ƿ��ǵ�һ���ڵ�
		if (size == 0) {
			// �����ǵ�һ���ڵ㣬����ͷ�ڵ�ָ������ڵ�
			this.first = node;
		} else {
			// ԭ����β�ڵ����һλָ���½ڵ�
			this.last.next = node;
		}
		// �½ڵ���������������һ���ڵ�
		this.last = node;
		size++;

	}

	private Node getNode(int index) {

		Node no = this.first;

		for (int i = 1; i <= index; i++) {
			no = no.next;
		}
		return no;
	}

	public void add(int index, String str) {

		// �ж��±�Խ��
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// ��ʾ��β������
		if (index == size) {
			add(str);
			return;
		}

		Node no = new Node(null, str, null);
		// �ж��Ƿ���ͷ�ڵ�
		if (index == 0) {
			// �½ڵ����һλָ��ԭ����ͷ�ڵ�
			no.next = this.first;
			// ԭ����ͷ�ڵ����һλָ���½ڵ�
			this.first.prev = no;
			// ��ͷ�ڵ�Ų���½ڵ���
			this.first = no;
		} else {

			Node node = getNode(index);

			// ԭ�ڵ����һ���ڵ����һλָ���½ڵ�
			node.prev.next = no;
			// �½ڵ����һλָ��ԭ�ڵ����һ���ڵ�
			no.prev = node.prev;
			// �½ڵ����һ���ڵ�ָ��ԭ�ڵ�
			no.next = node;
			// ԭ�ڵ����һλָ���½ڵ�
			node.prev = no;

		}

		size++;

	}

	private void out(int index) {
		if (index >= size || index < 0)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
	}

	public void remove(int index) {

		this.out(index);

		// �ж��Ƿ�ֻ��һ���ڵ㣬���ֻ��һ���ڵ㣬��ռ���
		if (size == 1) {
			this.first = null;
			this.last = null;
			size--;
			return;
		}

		// �ж�ͷ�ڵ�
		if (index == 0) {

			// ��ͷ�ڵ�Ų����һλ��
			this.first = this.first.next;
			// �µ�ͷ�ڵ����һλ��Ϊnull
			this.first.prev = null;

		} /* �ж�β�ڵ� */ else if (index == size - 1) {

			// ��β�ڵ�Ų����һ���ڵ���
			this.last = this.last.prev;
			// �µ�β�ڵ����һλ��Ϊnull
			this.last.next = null;

		} else {

			Node node = this.getNode(index);

			// ԭ�ڵ����һλ����һ���ڵ�ָ��ԭ�ڵ����һλ
			node.prev.next = node.next;
			// ԭ�ڵ����һλ����һ���ڵ�ָ��ԭ�ڵ����һλ
			node.next.prev = node.prev;

		}

		size--;
	}

	public int indexOf(String str) {

		Node node = this.first;

		for (int i = 1; i < size; i++) {

			String item = node.item;

			if (str == item || str != null && str.equals(item)) {
				return i;
			}

			node = node.next;
		}
		return -1;

	}

	public void remove(String str) {

		int index = indexOf(str);

		if (index != -1)
			this.remove(index);

	}

	public void set(int index, String str) {

		this.out(index);

		Node node = this.getNode(index);

		node.item = str;

	}

	public String get(int index) {

		this.out(index);

		return this.getNode(index).item;

	}

	public boolean contains(String str) {

		return this.indexOf(str) != -1;

	}

	// �ṩ��ת�б�Ĳ���
	public LinkList reverse() {

		LinkList list = new LinkList();

		Node node = this.last;
		for (int i = size - 1; i > 0; i--) {
			list.add(node.item);
			node = node.prev;
		}

		return list;

	}

	public String toString() {

		StringBuilder sb = new StringBuilder("[");

		Node node = this.first;

		for (int i = 0; i < size; i++) {

			sb.append(node.item).append(", ");
			node = node.next;

		}

		String str = sb.toString();

		if (size != 0)
			str = str.substring(0, str.length() - 2);

		return str += "]";

	}

	// ����һ������ڵ����
	private class Node {

		Node prev; // ��һ���ڵ�
		String item; // �洢��Ԫ��
		Node next; // ��һ���ڵ�

		public Node(Node prev, String item, Node next) {
			this.prev = prev;
			this.item = item;
			this.next = next;
		}

	}

}