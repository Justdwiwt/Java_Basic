package test_07_25;

public class RunnableDemo2 {

	public static void main(String[] args) {

		// Runnable r = new Runnable() {
		// @Override
		// public void run() {
		// System.out.println("Hello~~~");
		// }
		// };
		// Runnable r = () -> System.out.println("Hello~~~");
		//
		// new Thread(r).start();

		// ����ʽ���
		new Thread(() -> System.out.println("Hello~~~")).start();
	}

}
