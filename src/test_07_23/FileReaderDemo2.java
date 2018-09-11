package test_07_23;

import java.io.FileReader;

public class FileReaderDemo2 {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("E:\\a.txt");

		// ��Ŷ���ַ�
		// ��ʾÿ�δ洢7���ַ�
		char[] cs = new char[7];

		// ����һ����������¼ÿ�ζ�ȡ���ַ�����
		int len = -1;
		// ����ֵ��ʾ��һ�ζ�ȡ�����ַ��ĸ���
		// ���������ĩβ������-1
		// �ļ���һ����17���ַ�
		// ��һ�ζ�ȡ7���ַ�����ӡ7���ַ�
		// �ڶ��ζ�ȡ7���ַ�����ӡ7���ַ�
		// �����ζ�ȡ3���ַ�����ӡ3���ַ�
		// ���Ĵζ�ȡ��ĩβ������-1����ȡ����
		while ((len = reader.read(cs)) != -1) {
			System.out.println(new String(cs, 0, len));
		}

		// ����
		reader.close();
	}

}
