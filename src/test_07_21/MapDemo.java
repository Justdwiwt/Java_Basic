package test_07_21;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		// ��ʾ����String��ֵ��Double
		Map<String, Double> map = new HashMap<>();

		// ���Ԫ�� --- ��ֵ��
		map.put("hed", 3.85);
		map.put("nbs", 9.254);
		map.put("ohh", 3.85);
		map.put("bla", 4.01);
		// ������ظ����Ӧ��ֵ���и���
		// map.put("hed", 4.99);

		// ��ȡӳ���е����е�ֵ��Ȼ�����е�ֵ����һ��������
		Collection<Double> values = map.values();
		System.out.println(values);

		// ��ȡ��ֵ�Եĸ���
		// System.out.println(map.size());

		// Map<String, Double> map2 = new HashMap<>();
		// map2.put("bla", 4.01);
		// map2.put("nbs", 9.254);
		// map2.put("hed", 3.85);
		// map2.put("ohh", 3.85);
		// System.out.println(map.equals(map2));
		// ���ӳ��
		// map.clear();

		// ���ݼ��Ƴ������ֵ��
		// map.remove("nbs");
		// map.remove("gmc");

		// ���ݼ���ȡ����Ӧ��ֵ
		// System.out.println(map.get("bla"));
		// ����������ڣ��򷵻�null
		// System.out.println(map.get("els"));

		// �жϼ��Ƿ����
		// System.out.println(map.containsKey("ohh"));
		// System.out.println(map.containsKey("opl"));

		// �ж�ֵ�Ƿ����
		// System.out.println(map.containsValue(3.85));

		System.out.println(map);

	}

}
