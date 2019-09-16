package 第16章_多线程;

public class YieldTest extends Thread {

	// public void YieldTest(String name) {
	// super(name);
	// }

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + " " + i);
			if (i == 20) {
				// 线程让步
				Thread.yield();

			}
		}
	}

	public static void main(String[] args) {
		// 启动两个并发线程
		YieldTest yt1 = new YieldTest();
		yt1.setName("高级");
		yt1.setPriority(Thread.MAX_PRIORITY);
		yt1.start();

		YieldTest yt2 = new YieldTest();
		yt2.setName("低级");
		yt2.setPriority(MIN_PRIORITY);
		yt2.start();
	}
}
