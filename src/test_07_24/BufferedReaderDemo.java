package test_07_24;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {

		// ����������У�������ȡ���ݵ���FileReader
		// FileReader����ȡ���������ṩ��BufferedReader
		// BufferedReader���ṩһ��������
		BufferedReader reader = new BufferedReader(new FileReader("E:\\�ʼ�.docx"));

		// ��ȡһ������
		// String str = reader.readLine();
		// System.out.println(str);

		// ����һ����������¼ÿһ�е�����
		String str = null;

		while ((str = reader.readLine()) != null) {
			System.out.println(str);
		}

		// ����
		// ֻ��Ҫ�ر������������ɣ���ô���ʱ��ײ���Զ��ر�������
		reader.close();
	}

}
