package 第16章_多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 
 * TODO创建有返回的线程
 * 
 * @author LYi
 * @parameter
 *
 *
 * @date 2019年7月8日 下午4:07:02
 */
public class ThirdThread {
	public static void main(String[] args) {
		ThirdThread rt = new ThirdThread();
		FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
			int i = 0;
			for (; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + "的循环变量的值为" + i);
			}
			return i;
		});
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + "的循环变量的值为" + i);
			if(i==20){
				new Thread(task, "有返回值的线程").start();;
			}
		}
		try{
			System.out.println("子线程的返回值"+task.get());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
