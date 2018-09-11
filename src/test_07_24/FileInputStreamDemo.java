package test_07_24;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("E:\\a.txt");

		// �ֶ��ṩһ��������
		byte[] bs = new byte[10];

		// ����һ����������¼ÿ�ζ�ȡ���ֽڵĸ���
		int len = -1;

		while ((len = in.read(bs)) != -1) {
			System.out.println(new String(bs, 0, len));
		}

		// ����
		in.close();

	}

}
