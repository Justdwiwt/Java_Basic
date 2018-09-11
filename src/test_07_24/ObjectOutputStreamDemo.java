package test_07_24;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws Exception {

		Person p = new Person();
		p.setName("������");
		p.setAge(80);
		// p.classroom = "506";
		p.setWeight(70);

		// ����һ�����л�������
		// ObjectOutputStream������ת��Ϊ�ֽ�����
		// FileOutputStream���ֽ�����д���ļ���
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\p.data"));

		// д������
		out.writeObject(p);

		// ����
		out.close();
	}

}
