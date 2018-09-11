package test_07_25;

public class SellTicketDemo2 {

	public static void main(String[] args) {

		Ticket t = new Ticket();
		t.setCount(100);

		Sell s = new Sell(t);

		new Thread(s).start();
		new Thread(s).start();
		new Thread(s).start();
		new Thread(s).start();

	}

}

class Sell implements Runnable {

	private Ticket t;

	public Sell(Ticket t) {
		this.t = t;
	}

	@Override
	// ͬ������ --- ��������this
	public synchronized void run() {

		while (true) {

			// synchronized (this) {
			if (t.getCount() <= 0)
				break;

			t.setCount(t.getCount() - 1);
			System.out.println(Thread.currentThread().getName() + "����һ��Ʊ��ʣ��" + t.getCount() + "��Ʊ~~~");
			// }

		}

	}

}