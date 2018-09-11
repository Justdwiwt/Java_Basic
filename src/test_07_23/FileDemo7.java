package test_07_23;

import java.io.File;

public class FileDemo7 {
	
	public static void main(String[] args) {
		
		File file = new File("E:\\a.txt");
		
		// ·�����ı���ļ����ı������£�������������
		// �ļ������ı��·���ı������£������Ǽ���
		// Ҫ���ŵ�·����û��ͬ���ļ�
		boolean b = file.renameTo(new File("E:\\b.txt"));
		System.out.println(b);
	}

}
