package test_07_24;

import java.io.IOException;

public class SystemDemo {
	
	public static void main(String[] args) throws IOException {
		
		// ��ȡ����
		int i = System.in.read();
		
		// ϰ������out��ӡ�������
		System.out.println(i);
		// ϰ������err��ӡ�쳣
		System.err.println(i);
		
	}

}
