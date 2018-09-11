package test_07_29;

public class WaitNotifyOfProduct {
    public static void main(String[] args) {
        Product p = new Product();
        new Thread(new Producter(p)).start();
        new Thread(new Consumer(p)).start();
    }
}

class Product {
    private int count;
    public boolean flag = true;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class Producter implements Runnable {
    private Product p;

    Producter(Product p) {
        this.p = p;
    }

    @SuppressWarnings({"InfiniteLoopStatement", "SynchronizeOnNonFinalField", "PointlessBooleanExpression"})
    @Override
    public void run() {
        while (true)
            synchronized (p) {
                if (p.flag == false) try {
                    p.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int max = 1001 - p.getCount();
                int count = (int) (Math.random() * max);
                p.setCount(count + p.getCount());
                System.out.println(count + " " + p.getCount());
                p.flag = false;
                p.notify();
            }
    }
}

class Consumer implements Runnable {
    private Product p;

    Consumer(Product p) {
        this.p = p;
    }

    @SuppressWarnings({"InfiniteLoopStatement", "ControlFlowStatementWithoutBraces", "PointlessBooleanExpression", "SynchronizeOnNonFinalField"})
    @Override
    public void run() {
        while (true)
            synchronized (p) {
                if (p.flag == true) try {
                    p.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int count = (int) ((p.getCount() + 1) * Math.random());
                p.setCount(p.getCount() - count);
                System.out.println(count + " " + p.getCount());
                p.flag = true;
                p.notify();
            }
    }
}