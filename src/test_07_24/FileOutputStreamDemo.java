package test_07_24;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {

		FileOutputStream out = new FileOutputStream("E:\\a.txt");

		// д��"abc"
		// �ֽ���û�л�����
		out.write("abc".getBytes());
		
		out.close();

	}

}
