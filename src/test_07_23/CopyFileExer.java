package test_07_23;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileExer {

	public static void main(String[] args) throws IOException {

		// ����һ��������ָ��ԭ�ļ�
		FileReader reader = new FileReader("E:\\a.txt");

		// ����һ�������ָ�����ļ�
		FileWriter writer = new FileWriter("E:\\b.txt");

		// ������һ���ַ�������Ϊ������
		char[] cs = new char[10];

		// ����һ����������¼ÿ�ζ�ȡ���ַ�����
		int len = -1;

		// ��ȡ����
		while ((len = reader.read(cs)) != -1)
			// ��Ҫ����ȡ��������д��
			writer.write(cs, 0, len);

		// ����
		reader.close();
		writer.close();
	}

}
