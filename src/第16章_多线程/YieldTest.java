package ��16��_���߳�;

public class YieldTest extends Thread {

	// public void YieldTest(String name) {
	// super(name);
	// }

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + " " + i);
			if (i == 20) {
				// �߳��ò�
				Thread.yield();

			}
		}
	}

	public static void main(String[] args) {
		// �������������߳�
		YieldTest yt1 = new YieldTest();
		yt1.setName("�߼�");
		yt1.setPriority(Thread.MAX_PRIORITY);
		yt1.start();

		YieldTest yt2 = new YieldTest();
		yt2.setName("�ͼ�");
		yt2.setPriority(MIN_PRIORITY);
		yt2.start();
	}
}
