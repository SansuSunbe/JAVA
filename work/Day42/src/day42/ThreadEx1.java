package day42;

public class ThreadEx1 {
	public static void main(String[] args) {
		
		// JVM 스레드 요청
		// 1.Thread 클래스를 상속받은 클래스의 스레드를 요청
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		// 2.Runnable 인터페이스를 구현한 클래스의 스레드를 요청
		MyThread2 thread2 = new MyThread2();
		Thread thread = new Thread(thread2); // Thread(Runnable target)
		thread.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("메인 함수 진행 중 " + i);
		}
		
	}
}

// 1.Thread 클래스를 상속받아 구현
class MyThread1 extends Thread{
	// run() 메서드 오버라이딩(재정의)
	public void run() {
		// 스레드가 해야할 작업 구현
		for(int i = 0; i < 10; i++) {
			System.out.println("스레드 진행 중 " + i);
		}
	}
}

// 2.Runnable 인터페이스를 구현하여 작업을 구현
class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("러너블 진행중 " + i);
		}
		
	}
	
}