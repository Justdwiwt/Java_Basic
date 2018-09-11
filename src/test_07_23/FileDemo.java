package test_07_23;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		// ��ʾfile�������E���µ�a.txt�ļ�
		// ������File�����ʱ�򣬲���ȥ������м���ļ��Ƿ����
		// ֻ�ǽ�·���ַ������Ϊһ��file����
		File file = new File("E:\\a");

		// �����ļ�
		// ֻ������ļ������ڵ�ʱ����ܴ���
		// Ҫ���ļ���ŵ�·��������ʵ����
		// ֻ�ܴ����ļ����ܴ���Ŀ¼
		// boolean b = file.createNewFile();

		// ����Ŀ¼
		// mkdir --- make directory
		// ֻ�ܴ���Ŀ¼���ܴ����ļ�
		// ֻ�ܴ���һ��Ŀ¼
		// boolean b = file.mkdir();
		// �������Ŀ¼
		// boolean b = file.mkdirs();

		// ɾ���ļ���Ŀ¼
		// ���ļ��Ӽ�����г����Ƴ����˲���������
		// ��ɾ��Ŀ¼��ʱ����ҪĿ¼��û�����ļ�������Ŀ¼
		boolean b = file.delete();
		System.out.println(b);
	}

}
