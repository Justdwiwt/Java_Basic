package test_07_24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderExer {

	private static int count = 0;

	public static void main(String[] args) {

		File file = new File("E:\\workspace");

		countLine(file);

		System.out.println(count);

	}

	private static void countLine(File file) {

		if (file == null)
			throw new NullPointerException();

		// �ж��Ƿ���һ��Ŀ¼
		if (file.isDirectory()) {

			File[] fs = file.listFiles();
			for (File f : fs) {
				countLine(f);
			}

		} else if (file.getName().endsWith(".java")) {

			// ��ȡJava�ļ���ͳ������
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));

				while (reader.readLine() != null)
					count++;

				reader.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
