package 第16章_多线程;

import java.util.Date;

public class SleepThread {
	public static void main(String[] args) throws InterruptedException {
		// for (int i = 0; i < 10; i++) {
		while (true) {
			System.out.println("当前时间" + new Date());
			// 调用sleep（）让当前线程暂停
			Thread.sleep(1000);
		}
		
	}
}
