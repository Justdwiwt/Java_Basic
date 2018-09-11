package test_07_25;

public class WaitNotifyExer {

	public static void main(String[] args) {

		Product p = new Product();
		new Thread(new Producer(p)).start();
		new Thread(new Consumer(p)).start();

	}

}

class Product {

	private int count;
	// �涨���flagΪTRUE�����ʾ������Ʒ
	// �涨���flagΪFALSE�����ʾ������Ʒ
	public boolean flag = true;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

class Producer implements Runnable {

	private Product p;

	public Producer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {

		while (true) {

			synchronized (p) {

				if (p.flag == false)
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				// ���㱾�������������������
				int max = 1001 - p.getCount();

				// ���㱾��ʵ�ʵ���������
				int count = (int) (Math.random() * max);

				// ���㱾���ṩ����Ʒ����
				p.setCount(count + p.getCount());

				System.out.println("����������" + count + "����Ʒ�����ṩ" + p.getCount() + "����Ʒ");

				p.flag = false;

				p.notify();

			}

		}

	}

}

class Consumer implements Runnable {

	private Product p;

	public Consumer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {

		while (true) {

			synchronized (p) {

				if (p.flag == true)
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				// ���㱾����������
				int count = (int) ((p.getCount() + 1) * Math.random());

				// ���㱾��ʣ����Ʒ����
				p.setCount(p.getCount() - count);

				System.out.println("����������" + count + "����Ʒ��ʣ����" + p.getCount() + "����Ʒ");

				p.flag = true;
				p.notify();

			}

		}

	}

}
