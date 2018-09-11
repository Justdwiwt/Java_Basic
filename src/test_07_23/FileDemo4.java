package test_07_23;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {

		File file = new File("E:\\a.txt");
		
		// ��ȡ��һ�ε��޸�ʱ��
		System.out.println(file.lastModified());

		// �����ļ������һ���޸�ʱ��
		// ��Ҫ�ж�������õ������Ƿ����
		// file.setLastModified(684185455L);

		// ���ô��ļ��Ƿ��ִ��
		// boolean b = file.setExecutable(false);

		// ���ô��ļ��Ƿ�ɶ�
		// boolean b = file.setReadable(false);
		// ���ô��ļ��Ƿ��д
		// boolean b = file.setWritable(false);
		// ��ʾֻ����ǰ�û����ÿ�дȨ��
		// boolean b = file.setWritable(true, true);
		// System.out.println(b);
	}

}
