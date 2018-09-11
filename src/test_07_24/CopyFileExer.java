package test_07_24;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileExer {

	public static void main(String[] args) throws Exception {

		// ��¼��ʼʱ��
		long begin = System.currentTimeMillis();
		// ����һ���ֽ�������ָ��Ҫ��ȡ���ļ�
		FileInputStream in = new FileInputStream("E:\\a.zip");

		// ����һ���ֽ������ָ��Ҫ�洢���ļ�
		FileOutputStream out = new FileOutputStream("D:\\a.zip");

		// ����һ���ֽ�������Ϊ������
		byte[] bs = new byte[1024 * 1024 * 10];

		// ����һ��������ʾ��ȡ���ֽڸ���
		int len = -1;

		// ��ȡ����
		while ((len = in.read(bs)) != -1)
			// ����ȡ������д��
			out.write(bs, 0, len);

		// ����
		in.close();
		out.close();

		// ��¼����ʱ��
		long end = System.currentTimeMillis();

		System.out.println(end - begin);
	}

}
