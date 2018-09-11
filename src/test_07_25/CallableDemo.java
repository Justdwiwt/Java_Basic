package test_07_25;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

    public static void main(String[] args) throws Exception {

        CDemo c = new CDemo();
        ExecutorService es = Executors.newCachedThreadPool();
        Future<String> f = es.submit(c);
        es.shutdown();
        System.out.println(f.get());
    }

}

class CDemo implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "hahah~~~";
    }

}