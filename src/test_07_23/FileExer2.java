package test_07_23;

import java.io.File;

public class FileExer2 {

	private static int javaCount = 0;
	private static int classCount = 0;

	public static void main(String[] args) {

		File file = new File("E:\\workspace");

		count(file);

		System.out.println("Java�ļ���" + javaCount);
		System.out.println("class�ļ���" + classCount);

	}

	private static void count(File file) {

		// �жϲ���Ϊ��
		if (file == null)
			throw new NullPointerException();

		// �ж��Ƿ���һ��Ŀ¼
		if (file.isDirectory()) {

			// ��ȡ���е����ļ�����Ŀ¼
			File[] fs = file.listFiles();
			for (File file2 : fs) {
				count(file2);
			}

		} /* ���file����Ŀ¼�����ļ� */ else if (file.getName().endsWith(".java")) {
			javaCount++;
		} else if (file.getName().endsWith(".class")) {
			classCount++;
		}

	}

}
