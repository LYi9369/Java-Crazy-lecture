package ��16��_���߳�;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 
 * TODO�����з��ص��߳�
 * 
 * @author LYi
 * @parameter
 *
 *
 * @date 2019��7��8�� ����4:07:02
 */
public class ThirdThread {
	public static void main(String[] args) {
		ThirdThread rt = new ThirdThread();
		FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
			int i = 0;
			for (; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + "��ѭ��������ֵΪ" + i);
			}
			return i;
		});
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() + "��ѭ��������ֵΪ" + i);
			if(i==20){
				new Thread(task, "�з���ֵ���߳�").start();;
			}
		}
		try{
			System.out.println("���̵߳ķ���ֵ"+task.get());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
