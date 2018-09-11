package test_07_25;

public class WaitNotifyAllDemo {

    public static void main(String[] args) {

        Product p = new Product();
        new Thread(new Producer2(p)).start();
        new Thread(new Producer2(p)).start();
        new Thread(new Consumer2(p)).start();
        new Thread(new Consumer2(p)).start();

    }

}

class Producer2 implements Runnable {

    private Product p;

    public Producer2(Product p) {
        this.p = p;
    }

    @Override
    public void run() {

        while (true) {

            synchronized (p) {

                while (p.flag == false)
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

                p.notifyAll();

            }

        }

    }

}

class Consumer2 implements Runnable {

    private Product p;

    public Consumer2(Product p) {
        this.p = p;
    }

    @Override
    public void run() {

        while (true) {

            synchronized (p) {

                while (p.flag == true)
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
                p.notifyAll();

            }

        }

    }

}
