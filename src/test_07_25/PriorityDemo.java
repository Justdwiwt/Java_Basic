package test_07_25;

public class PriorityDemo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new PDemo(),"A");
		Thread t2 = new Thread(new PDemo(),"B");
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
		// ��ȡ�̵߳����ȼ�
		// System.out.println(t1.getPriority());
		// System.out.println(t2.getPriority());

	}

}

class PDemo implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

}
