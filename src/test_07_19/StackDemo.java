package test_07_19;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();

		// ��ջ
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");

		// ��ȡָ��Ԫ�ص�λ��
		// ��ջ����ջ�����β��ң�����Ϊ1
		System.out.println(s.search("b"));

		// ���ջΪ�գ�����ֿ�ջ�쳣
		// ��ȡ�����Ƴ�ջ��Ԫ��
		// System.out.println(s.peek());

		// ��ȡ�����Ƴ�ջ��Ԫ��
		// System.out.println(s.pop());

		System.out.println(s);
	}

}
