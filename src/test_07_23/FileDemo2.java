package test_07_23;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {

		File file = new File("D:\\3.gif");

		// ��ȡ���е���Ŀ¼�����ļ�
		// File[] fs= file.listFiles();
		// for (File f : fs) {
		// System.out.println(f);
		// }

		// �ж�Ŀ¼
		// System.out.println(file.isDirectory());
		
		// ��ȡ�ļ���
		System.out.println(file.getName().endsWith(".java"));

	}

}
