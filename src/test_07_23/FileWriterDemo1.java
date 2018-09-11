package test_07_23;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {

		// �������ļ� --- ������ļ��Ѵ��ڣ��ᱻ����
		FileWriter writer = new FileWriter("E:\\a.txt");

		// д������
		// ��������д���������У�����������֮����д���ļ���
		// ����д����������֮�󣬻�������û����������ͽ�����
		// ���ݻ��ڻ�������û���ü�д���ļ���
		writer.write("defg");

		// ��ˢ������
		// writer.flush();

		// �ر�������
		// ����֮ǰ�Զ���һ�γ�ˢ�������Ĳ������Է����������ڻ�������
		writer.close();

		System.out.println(writer);

		// Ϊ���ͷ���Դ
		writer = null;
	}

}
