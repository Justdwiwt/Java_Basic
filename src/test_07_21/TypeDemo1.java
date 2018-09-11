package test_07_21;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class TypeDemo1 {

	public static void main(String[] args) {

		// �ײ�����Object��ʽ�洢����
		// List list = new ArrayList();
		// ֻ�������Ե����ã�������ǿ����
		// List list = new ArrayList<String>();
		// List<String> list = new ArrayList();
		// List<String> list = new ArrayList<String>();
		// ��JDK1.7��ʼ�������ʵ������ʱ����Բ���ָ����������
		// �����ڱ����ʱ�����ǰ�ߵķ����������Զ��Ƶ�
		List<String> list = new ArrayList<>();

		list.add("abc");
		// list.add(2);
		// list.add(true);

		// Iterator it = list.iterator();
		// while (it.hasNext()) {
		// Object o = it.next();
		//
		// if (o instanceof String) {
		// String str = (String) o;
		// } else if (o instanceof Double) {
		// Double d = (Double) o;
		// }
		//
		// }
	}

}
