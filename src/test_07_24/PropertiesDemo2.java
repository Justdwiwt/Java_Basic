package test_07_24;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();

		// �����л�����
		prop.load(new FileInputStream("p.properties"));

		System.out.println(prop.getProperty("����"));
		System.out.println(prop.getProperty("����"));
		System.out.println(prop.getProperty("�Ա�"));

	}

}
