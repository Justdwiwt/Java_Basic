package test_07_25;

public class SingleTonDemo {

	public static void main(String[] args) {

		// TaskManager t1 = TaskManager.getInstance();
		// TaskManager t2 = TaskManager.getInstance();

		TaskManager.kill();
	}

}

class TaskManager {

	private static TaskManager tm;

	private TaskManager() {
	}

	// ��֤���õ���������ʱ���ٴ���
	// �� ������ʱ����ƺ���
	public static TaskManager getInstance() {
		if (tm == null)
			tm = new TaskManager();

		return tm;
	}

	public static void kill() {
	}

}

// class TaskManager {
//
// // �ڶ����ʱ����Ѿ������˳�ʼ�� --- ����ʽ
// private static TaskManager tm = new TaskManager();
//
// // ���������������ⴴ������
// private TaskManager() {
// }
//
// public static TaskManager getInstance() {
// // ��tm�������һЩ��ʼ���Ĳ���
// return tm;
// }
//
// public static void kill() {
// }
//
// }