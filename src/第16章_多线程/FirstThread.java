package ��16��_���߳�;

/**
 * 
 * TODO ���̵߳Ĵ����� 
 * �����Լ��������̣߳�ϵͳ���߳���Ĭ�ϴ��ڵģ�Ҳ����������̶߳�CPU��Դ�ľ���
 * 
 * @author LYi
 * @parameter
 *
 *
 * @date 2019��7��8�� ����2:45:53
 */
public class FirstThread extends Thread {
	public void run() {
		for (int i = 0; i < 50; i++) {
			// getName()���������߳���
			System.out.println(getName() + " " + i);
		}

	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// ����Thread��currentThread������ȡ��ǰ�߳�
			// ��������������߳� main
			System.out.println(Thread.currentThread().getName() + " " + i);
			// ��i=20ʱ�ᴴ��2���߳�
			if (i == 20) {
				// ������������һ���߳�
				new FirstThread().start();
				// �����������ڶ����߳�
				new FirstThread().start();
			}
		}
	}
}
