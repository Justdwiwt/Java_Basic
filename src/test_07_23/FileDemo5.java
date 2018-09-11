package test_07_23;

import java.io.File;

public class FileDemo5 {

	public static void main(String[] args) {

		// ���Ʒָ���
		// ��Windows�зָ�Ŀ¼��\\����Linux�зָ�Ŀ¼��/
		// ·���ָ���
		// ��Windows������·����;����Linux������·����:
		File file = new File("C:"+ File.separatorChar +"test\\path\\a.txt");

		// ��ȡ�ļ��ľ���·��
		// System.out.println(file.getAbsolutePath());

		// ��ȡ��·��
		System.out.println(file.getParent());
		// ��ȡ�ļ���
		System.out.println(file.getName());
	}

}
