package test_07_23;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {

		File file = new File("E:\\workspace");
		
		// �ж�file��ʾ���ļ�����Ŀ¼�Ƿ���ʵ����
		System.out.println(file.exists());

		// �ж��Ƿ���һ������·��
		// System.out.println(file.isAbsolute());

		// �ж��Ƿ���һ�������ļ�
		// System.out.println(file.isHidden());

		// �ж��Ƿ���һ����ִ���ļ�
		// System.out.println(file.canExecute());

		// �ж��Ƿ���һ����д�ļ�
		// System.out.println(file.canWrite());
		// �ж��Ƿ���һ���ļ�
		// System.out.println(file.isFile());
	}

}
