package ��16��_���߳�;

public class SecondThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 20) {
				SecondThread st = new SecondThread();
				// new Thread(�̶߳���, "�Զ����߳���")
				new Thread(st, "���߳�1").start();

				new Thread(st, "���߳�2").start();

			}
		}
	}
}
