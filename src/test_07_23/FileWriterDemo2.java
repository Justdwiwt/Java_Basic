package test_07_23;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) {

		// ��������Ҫ�ŵ�try֮�ⶨ�岢�Ҹ�ֵΪnull
		FileWriter writer = null;
		try {
			// �ŵ�try֮�ڽ��д���
			writer = new FileWriter("E:\\b.txt");
			writer.write("abc");
			// Ϊ�˷�ֹ����ʧ�ܵ������ݶ�ʧ
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ��Ҫ�ж��������Ƿ��ʼ���ɹ�
			if (writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					// �������ʧ�ܣ���ô��ʾǿ�ƻ������������ͷ��ļ�
					// ��������ɹ�����ô��ʾ�ͷ��ڴ�
					writer = null;
				}
		}

	}

}
