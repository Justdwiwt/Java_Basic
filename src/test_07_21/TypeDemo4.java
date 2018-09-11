package test_07_21;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo4 {

	public static void main(String[] args) {

		List<Integer> ins = new ArrayList<>();
		ins.add(5);
		ins.add(0);
		ins.add(6);
		ins.add(3);
		ins.add(2);
		ins.add(9);

		List<Double> dos = new ArrayList<>();
		dos.add(3.5);
		dos.add(2.09);
		dos.add(7.00);
		dos.add(9.12);
		dos.add(6.001);
		dos.add(4.68);

		// List<String> strs = new ArrayList<>();
		// print(strs);

		print(ins);
		print(dos);
	}

	// ����Ԫ������Ϊ��ֵ�͵��б�
	// ? extends ��/�ӿ� ��ʾ���������/�ӿڻ���������/�ӽӿڶ���
	// ? extends Number ��ʾ����Number��������
	// ���ܴ�������Ԫ��������Number --- �涨�˷��͵�����
	public static void print(List<? extends Number> list) {

		// �ܷ���list�б������Ԫ�أ�
		// list.add(3);
		list.add(null);

		for (Number n : list) {
			System.out.println(n);
		}
	}

	// ����Ԫ��������String���丸����б�
	// ? super ��/�ӿ� ��ʾ������/�ӿڼ��丸��/���ӿڶ���
	// List<String> list;
	// List<Object> os;
	// List<Serializable> ses;
	// ���ܴ������С������String --- �涨���͵�����
	public static void print2(List<? super String> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}

}
