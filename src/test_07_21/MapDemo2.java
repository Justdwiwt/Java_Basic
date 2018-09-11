package test_07_21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<>(5);
		map.put("hed", 3.85);
		map.put("nbs", 9.254);
		map.put("ohh", 3.85);
		map.put("bla", 4.01);

		// keySet() --- ��ʾ��ӳ�������еļ�����һ��set������
		// Set<String> keys = map.keySet();
		// for (String key : keys) {
		// System.out.println(key + ":" + map.get(key));
		// }

		// entrySet() --- ��ʾ��ӳ�������еļ�ֵ�Է���һ��set������
		// Set�д���Ǽ�ֵ�ԣ����Է���������Map.Entry
		Set<Map.Entry<String, Double>> entrys = map.entrySet();
		for (Map.Entry<String, Double> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
