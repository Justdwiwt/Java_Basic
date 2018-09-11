package test_07_25;

public class DeadLockDemo {

    public static void main(String[] args) {

        Printer p = new Printer();
        Scanner s = new Scanner();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s) {
                    s.scan();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (p) {
                        p.print();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {

                synchronized (p) {
                    p.print();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s) {
                        s.scan();
                    }

                }

            }

        }).start();

    }

}

class Printer {

    public void print() {
        System.out.println("��ӡ���ں������Ĵ�ӡ~~~");
    }

}

class Scanner {

    public void scan() {
        System.out.println("ɨ�����ں�������ɨ��~~~");
    }

}
