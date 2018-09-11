package test_07_21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ��ȡ�ַ���
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// ����һ��ӳ��洢ÿһ���ַ����ֵĴ���
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			// ��ȡ�ַ�����Ӧλ���ϵ��ַ�
			char c = str.charAt(i);

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
