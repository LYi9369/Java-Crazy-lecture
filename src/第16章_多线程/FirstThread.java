package 第16章_多线程;

/**
 * 
 * TODO 多线程的创建。 
 * 除了自己创建的线程，系统主线程是默认存在的，也会参与其他线程对CPU资源的竞争
 * 
 * @author LYi
 * @parameter
 *
 *
 * @date 2019年7月8日 下午2:45:53
 */
public class FirstThread extends Thread {
	public void run() {
		for (int i = 0; i < 50; i++) {
			// getName()方法返回线程名
			System.out.println(getName() + " " + i);
		}

	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// 调用Thread的currentThread方法获取当前线程
			// 下面输出的是主线程 main
			System.out.println(Thread.currentThread().getName() + " " + i);
			// 当i=20时会创建2个线程
			if (i == 20) {
				// 创建并启动第一个线程
				new FirstThread().start();
				// 创建并启动第二个线程
				new FirstThread().start();
			}
		}
	}
}
