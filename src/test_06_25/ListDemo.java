package test_06_25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//计算最大疯狂值
public class ListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input count:");
		int number = sc.nextInt();
		List<Integer> l = new ArrayList<Integer>();
		System.out.println("Start input:");
		for (int i = 0; i < number; i++)
			l.add(sc.nextInt());
		System.out.println(sort(l));
	}

	@SuppressWarnings("SpellCheckingInspection")
	public static void resever(int[] arr) {
		for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
			arr[start] ^= arr[end];
			arr[end] ^= arr[start];
			arr[start] ^= arr[end];
		}
	}

	@SuppressWarnings("Duplicates")
	private static int sort(List<Integer> list) {
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
