package test_07_24;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws Exception {

		// ������һ��ת��������
		// ����д������FileOutputStream
		// OutputStreamWriter���ַ�ת��Ϊ�ֽ�
		// ���ַ�ת��Ϊ�ֽ� --- ����
		// �����ָ�������õ���Ĭ�ϱ���
		// OutputStreamWriter ow =
		// new OutputStreamWriter(new FileOutputStream("a.txt"));
		OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("a.txt"), "utf-8");

		ow.write("�ַ���");

		ow.close();
	}

}
