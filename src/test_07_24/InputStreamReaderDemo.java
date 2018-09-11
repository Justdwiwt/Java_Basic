package test_07_24;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	
	public static void main(String[] args) throws Exception {
		
		// ������ȡ���ݵ���FileInputStream
		// FileInputStream�����ֽ���ʽ��ȡ����
		// InputStreamReader����ȡ�����ֽ�ת��Ϊ�ַ�
		InputStreamReader in = 
		new InputStreamReader(new FileInputStream("a.txt"), "utf-8");
		
		char[] cs = new char[10];
		int len = in.read(cs);
		
		System.out.println(new String(cs,0,len));
		
		in.close();
		
		// FileReader reader = new FileReader("a.txt");
		// reader = new InputStreamReader(new FileInputStream("a.txt"));
		
	}

}
