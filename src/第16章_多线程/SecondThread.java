package 第16章_多线程;

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
				// new Thread(线程对象, "自定义线程名")
				new Thread(st, "新线程1").start();

				new Thread(st, "新线程2").start();

			}
		}
	}
}
