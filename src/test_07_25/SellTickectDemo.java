package test_07_25;

import java.io.FileInputStream;
import java.util.Properties;

public class SellTickectDemo {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		prop.load(new FileInputStream("count.properties"));
		int count = Integer.parseInt(prop.getProperty("count"));

		Ticket t = new Ticket();
		t.setCount(count);

		Seller s1 = new Seller(t);
		Seller s2 = new Seller(t);
		Seller s3 = new Seller(t);
		Seller s4 = new Seller(t);

		new Thread(s1, "Ա��1��").start();
		new Thread(s2, "Ա��2��").start();
		new Thread(s3, "Ա��3��").start();
		new Thread(s4, "Ա��4��").start();

	}

}

class Seller implements Runnable {

	private Ticket t;

	public Seller(Ticket t) {
		this.t = t;
	}

	@Override
	public void run() {

		while (true) {
			// ͬ������� --- ��Ҫһ����
			// ��Ҫ�����е��̶߳�����ʶ
			// synchronized (t) {
			// Seller.class��ʾSeller��Ӧ����
			// Seller����ֽ����Ǵ��ڷ�����
			// �������Ǳ������̹߳����
			// synchronized (Seller.class) {
			synchronized (Math.class) {
				if (t.getCount() <= 0)
					break;
				try {
					// ��ʾ�õ�ǰ�߳�����˯��״̬
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				t.setCount(t.getCount() - 1);
				// ��ʾ��ȡ��ǰ��ִ�е��߳�,Ȼ���ȡ����̵߳�����
				System.out.println(Thread.currentThread().getName() + "����һ��Ʊ��ʣ��" + t.getCount() + "��Ʊ~~~");
			}

		}

	}

}

// ������һ������Ʊ����
class Ticket {

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}