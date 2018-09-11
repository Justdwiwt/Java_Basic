package test_07_24;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();

		// ���Ԫ��
		prop.setProperty("����", "���ʦ̫");
		prop.setProperty("����", "50");
		prop.setProperty("�Ա�", "Ů");

		// �־û����ӳ��
		// Properties����ֻ�ܴ�ŵ�properties�ļ���
		// �ڶ���������ʾ�����properties�ļ����ע��
		prop.store(new FileOutputStream("p.properties"), "�����һ����~~~");
		
		System.out.println('\u706d');

	}

}
