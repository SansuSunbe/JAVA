package day44;

public class MultiThreadEx2 {
	public static void main(String[] args) {

		MyThreadB s1 = new MyThreadB();
		Thread thread1 = new Thread(s1, "A");
		Thread thread2 = new Thread(s1, "B");
		Thread thread3 = new Thread(s1, "C");

		thread1.start();
		thread2.start();
		thread3.start();

	}
}

class MyThreadB implements Runnable {

	Ticketing ticket = new Ticketing();

	@Override
	public void run() {
		ticket.ticketing();
	}
}

class Ticketing {

	int ticketNumber = 1;

	public void ticketing() {
		synchronized (this) {

			if (ticketNumber > 0) {
				System.out.println(Thread.currentThread().getName() + " 가 티켓팅 성공");
				ticketNumber--;
			} else {
				System.out.println(Thread.currentThread().getName() + " 가 티켓팅 실패");
			}
			System.out.println(Thread.currentThread().getName() + " 가 티켓팅 시도 후 티켓 수 : " + ticketNumber);
		}
	}

}
