package test_07_23;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {

		// ������һ������������
		FileReader reader = new FileReader("E:\\a.txt");

		// ��ȡ����
		// ����ֵ��ʾ����������ݵı���
		// ������û�л�����
		// int i = reader.read();

		// ����һ����������¼ÿ�ζ�ȡ���ַ�
		int i = -1;
		// ����ĩβ����-1
		while ((i = reader.read()) != -1)
			System.out.println((char) i);

		// while(reader.read() != -1)
		// System.out.println((char)reader.read());

		// ����
		reader.close();

	}

}
