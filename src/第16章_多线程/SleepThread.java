package ��16��_���߳�;

import java.util.Date;

public class SleepThread {
	public static void main(String[] args) throws InterruptedException {
		// for (int i = 0; i < 10; i++) {
		while (true) {
			System.out.println("��ǰʱ��" + new Date());
			// ����sleep�����õ�ǰ�߳���ͣ
			Thread.sleep(1000);
		}
		
	}
}
