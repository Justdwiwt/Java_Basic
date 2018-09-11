package test_07_25;

public class DaemonDemo {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(new Soldier(), "С��1��");
        Thread t2 = new Thread(new Soldier(), "С��2��");
        Thread t3 = new Thread(new Soldier(), "С��3��");
        Thread t4 = new Thread(new Soldier(), "С��4��");

        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t4.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        for (int i = 10; i > 0; i--) {
            System.out.println("Boss����һ��Ѫ��ʣ��" + i);
            Thread.sleep(1000);
        }

    }

}

class Soldier implements Runnable {

    @Override
    public void run() {

        for (int i = 10000; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + "����һ��Ѫ��ʣ��" + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}