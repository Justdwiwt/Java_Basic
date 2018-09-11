package test_06_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入这串数字的长度：");
		int number = sc.nextInt();
		System.out.println("依次输出这串数字：");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < number; i++)
			list.add(sc.nextInt());
		int sum = getSum(list);
		System.out.println(sum);
	}

	@SuppressWarnings("Duplicates")
	private static int getSum(List<Integer> list) {
		Collections.sort(list);
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(list.get(list.size() - 1));
		int index = 0;
		for (int i = 0, start = 0, end = list.size() - 2; i < list.size() - 1; i++) {
			if (index == 0) {
				ls.add(0, list.get(start));
				start++;
			} else if (index == 1) {
				ls.add(list.get(start));
				start++;
			} else if (index == 2) {
				ls.add(0, list.get(end));
				end--;
			} else {
				ls.add(list.get(end));
				end--;
				index = -1;
			}
			index++;
		}
		int sum = 0;
		for (int i = 0; i < ls.size() - 1; i++)
			sum += Math.abs(ls.get(i) - ls.get(i + 1));
		return sum;
	}
}
