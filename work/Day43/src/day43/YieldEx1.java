package day43;

public class YieldEx1 {
	public static void main(String[] args) {
		
		MyThread4 myThread4 = new MyThread4();
		MyThread5 myThread5 = new MyThread5();
		
		Thread thread1 = new Thread(myThread4);
		Thread thread2 = new Thread(myThread5);
		
		thread1.start();
		thread2.start();
		
	}
}

class MyThread4 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("★");
		}
	}
}

class MyThread5 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5; i ++) {
			System.out.println("☆");
			Thread.yield();
		}
	}
}