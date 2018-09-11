package test_07_24;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class TestDemo2 {

	FileWriter writer;

	@Before
	// �ڲ��Է���֮ǰִ���������һЩ��ʼ���Ĳ���
	public void init() throws IOException {
		writer = new FileWriter("E:\\a.txt", true);
	}

	@Test
	public void write1() throws IOException {
		writer.write("abc");
	}

	@Test
	public void write2() throws IOException {
		writer.write("def");
	}

	@After
	// �ڲ��Է���֮��ִ���������һЩ�ƺ�Ĺ���
	public void destroy() throws IOException {
		writer.close();
	}

}
