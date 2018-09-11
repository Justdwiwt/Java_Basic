package test_07_23;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {

	public static void main(String[] args) {

		// ���ַ�ʽ����ִ�����֮����Զ�����
		// ��JDK1.7��ʼ��Ҫ�����ʹ�õ������ʵ��AutoCloseable
		try (FileWriter writer = new FileWriter("E:\\c.txt")) {

			writer.write("abc");
			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
