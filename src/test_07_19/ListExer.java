package test_07_19;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListExer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		// �洢�����Ԫ��
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(s.nextInt());
		}

		// ����
		// Ĭ����������
		Collections.sort(list);

		int sum1 = getCrazy(list);

		// ��ת�б�
		Collections.reverse(list);
		int sum2 = getCrazy(list);

		System.out.println(sum1 > sum2 ? sum1 : sum2);
	}

	private static int getCrazy(List<Integer> list) {

		// �洢���
		List<Integer> result = new LinkedList<Integer>();

		result.add(list.get(0));

		// ǰ�� ��� ǰС ��С
		// 0 1 2 3
		int state = 0;

		for (int i = 1, j = list.size() - 1; i <= j;) {

			if (state == 0) {
				result.add(0, list.get(j));
				j--;
			} else if (state == 1) {
				result.add(list.get(j));
				j--;
			} else if (state == 2) {
				result.add(0, list.get(i));
				i++;
			} else {
				result.add(list.get(i));
				i++;
			}
			state++;

			if (state == 4)
				state = 0;

		}

		System.out.println(result);

		int sum = 0;
		for (int i = 0; i < result.size() - 1; i++) {
			sum += Math.abs(result.get(i) - result.get(i + 1));
		}

		return sum;
	}

}
