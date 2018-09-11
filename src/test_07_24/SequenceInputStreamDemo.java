package test_07_24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws Exception {

		// �����������ֱ�ָ�������ļ�
		FileInputStream in1 = new FileInputStream("D:\\a.txt");
		FileInputStream in2 = new FileInputStream("D:\\b.txt");
		FileInputStream in3 = new FileInputStream("D:\\c.txt");

		// ��Ҫ����һ��Vector����洢������������
		Vector<InputStream> v = new Vector<>();
		v.add(in1);
		v.add(in2);
		v.add(in3);

		// ����Enumeration����
		Enumeration<InputStream> e = v.elements();

		// �����ϲ�������
		SequenceInputStream sis = new SequenceInputStream(e);

		// ����һ���������ָ��Ҫ��ŵ��ļ�
		FileOutputStream out = new FileOutputStream("D:\\test.txt");

		// ��ȡ����
		byte[] bs = new byte[10];
		int len = -1;
		while ((len = sis.read(bs)) != -1)
			out.write(bs, 0, len);

		// ����
		sis.close();
		out.close();
	}

}
