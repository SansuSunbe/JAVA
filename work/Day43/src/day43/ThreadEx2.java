package day43;

public class ThreadEx2 {
	public static void main(String[] args) {
		
		Runnable thread1 = new MyThread3(); // 업 캐스팅
		Thread thread2 = new Thread(thread1, "thread1"); // new Thread(Runnable, target, String name)
		
		thread2.setPriority(1); // 우선순위 1로 지정
		
		System.out.println("thread2의 우선 순위 : " + thread2.getPriority());
		
		Thread thread3 = new Thread(thread1, "thread3");
		System.out.println("thread3의 우선 순위 : " + thread3.getPriority());
		
		Thread thread4 = new Thread(thread1, "thread4");
		thread4.setPriority(10); // 우선순위 10으로 지정
		System.out.println("thread4의 우선 순위 : " + thread4.getPriority());
		
		thread2.start();
		thread3.start();
		thread4.start();
		
	}
}

class MyThread3 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("<" + Thread.currentThread().getName() + ">");
		}
		for(int i = 0; i < 1000; i++) {
			// 시간 지연
		}
		
	}
	
}
