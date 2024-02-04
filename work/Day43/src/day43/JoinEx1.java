package day43;

public class JoinEx1 {
	public static void main(String[] args) {

		MyThread6 myThread6 = new MyThread6();
		MyThread7 myThread7 = new MyThread7();
		Thread thread1 = new Thread(myThread6);
		Thread thread2 = new Thread(myThread7);

		thread1.start();
		try {
			thread1.join(); // thread1을 제외한 나머지 스레드 block
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}

		thread2.start();
		try {
			thread2.join(); // thread2을 제외한 나머지 스레드 block
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("메인스레드 : " + i);
		}

	}
}

class MyThread6 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread1 : " + i);
		}
		System.out.println("thread1 완료");
	}
}

class MyThread7 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread2 : " + i);
		}
		System.out.println("thread2 완료");
	}
}
