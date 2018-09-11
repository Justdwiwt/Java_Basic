package test_07_25;

public class WaitNotifyDemo {

	public static void main(String[] args) {

		Student s = new Student();
		s.setName("�仨");

		new Thread(new Ask(s)).start();
		new Thread(new Change(s)).start();
	}

}

class Ask implements Runnable {

	private Student s;

	public Ask(Student s) {
		this.s = s;
	}

	@Override
	public void run() {

		while (true) {

			synchronized (s) {

				if (s.flag == false)
					try {
						// ��ʾ�õ�ǰ�߳�����ȴ�
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				System.out.println("��ʦ������" + s.getName());
				System.out.println("������һ������~~~");

				s.flag = false;
				s.notify();
			}

		}

	}

}

class Change implements Runnable {

	private Student s;

	public Change(Student s) {
		this.s = s;
	}

	@Override
	public void run() {

		while (true) {

			synchronized (s) {

				if (s.flag == true)
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				if (s.getName().equals("����")) {
					s.setName("�仨");
				} else {
					s.setName("����");
				}

				s.flag = true;
				// �����ڵȴ����߳�
				s.notify();
			}

		}

	}

}

class Student {

	private String name;

	// ��һ�����
	// �涨flag��ֵΪtrue������Ask�߳�ִ����Change�̵߳ȴ�
	// �涨flag��ֵΪfalse������Change�߳�ִ����Ask�̵߳ȴ�
	// ����������һ������������״̬�ı�� --- ���λ
	public boolean flag = true;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}