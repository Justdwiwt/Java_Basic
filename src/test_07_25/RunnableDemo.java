package test_07_25;

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		RDemo r = new RDemo();
		
		Thread t = new Thread(r);
		t.start();
		
	}

}

class RDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}