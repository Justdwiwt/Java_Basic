package test_07_24;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

    public static void main(String[] args) throws Exception {

        // ���������л�������
        // FileInputStream��ȡ�ļ�����ȡ��һ���ֽ�����
        // ObjectInputStream���ֽ�����ת��Ϊ����
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\p.data"));

        // ��ȡ����
       Person p = (Person) in.readObject();

        // ����
        in.close();

        System.out.println(p.getName());
        System.out.println(p.getAge());

    }

}
