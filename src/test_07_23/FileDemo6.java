package test_07_23;

import java.io.File;
//import java.io.FileFilter;
//import java.io.FilenameFilter;

public class FileDemo6 {

	public static void main(String[] args) {

		File file = new File("D:\\");

		// ��ȡD���µ����е����ļ�
		// File[] fs = file.listFiles(new FileFilter() {
		//
		// @Override
		// // �������α�ʾ��ǰĿ¼�µ����ļ�����Ŀ¼
		// // �ѹ��˹���д��accept������
		// // �������������Զ�����fs������
		// public boolean accept(File pathname) {
		// return pathname.isFile();
		// }
		// });

		// ��ȡD���µ����е���Ŀ¼
		// File[] fs = file.listFiles(f -> f.isDirectory());

		// ��ȡD���µ����к������ֵ��ļ�����Ŀ¼
		// File[] fs = file.listFiles(f -> f.getName().matches(".*\\d.*"));
		// File[] fs = file.listFiles(new FilenameFilter() {
		//
		// @Override
		// // dir ��ʾ�ļ����ڵĸ�Ŀ¼
		// // name ��ʾ�ļ�����Ŀ¼������
		// public boolean accept(File dir, String name) {
		// return name.matches(".*\\d.*");
		// }
		// });
		// File[] fs = file.listFiles((dir, name) -> name.matches(".*\\d.*"));

		// ��ȡ�����к��д�д��ĸ���ļ�����Ŀ¼
		File[] fs = file.listFiles((dir, name) -> name.matches(".*[A-Z].*"));
		for (File f : fs) {
			System.out.println(f);
		}
	}

}
