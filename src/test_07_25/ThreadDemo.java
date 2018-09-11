package test_07_25;

public class ThreadDemo {

	public static void main(String[] args) {

		// ������һ���̶߳���
		TDemo t = new TDemo();
		// t.run();
		// ������߳�������ִ������
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main:" + i);
		}
	}

}

// ������һ����̳���Thread
class TDemo extends Thread {

	// �߳���Ҫִ�е��߼���Ҫ�ŵ�run����
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread:" + i);
		}

	}

}