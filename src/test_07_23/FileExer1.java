package test_07_23;

import java.io.File;

public class FileExer1 {

	public static void main(String[] args) {

		File file = new File("E:\\aaa");

		del(file);

	}

	public static void del(File file) {

		// �жϲ����Ƿ�Ϊ��
		if (file == null)
			throw new NullPointerException("�ף��ļ�����Ϊ�գ�����");

		// �ж���һ���ļ�����һ��Ŀ¼
		if (file.isDirectory()) {

			// ��ȡ���Ŀ¼�µ����е����ļ�����Ŀ¼
			File[] fs = file.listFiles();

			for (File f : fs) {
				// ���α���ÿһ��Ԫ�أ��ж����Ԫ�����ļ�����Ŀ¼��Ȼ�����
				// ���������͵�ǰ�����Ĺ���һ��
				del(f);
			}

		}
		// �������ļ�����Ŀ¼����Ҫɾ��
		file.delete();
	}

}
