package day34;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx1 {
	public static void main(String[] args) throws InterruptedException {
		
		Timer timer = new Timer(true);
		TimerTask work1 = new Work1();
		TimerTask work2 = new Work2();
		
		timer.schedule(work1, 3000); // 3초뒤 실행
		timer.schedule(work2, 5000); // 5초뒤 실행
		Thread.sleep(10000); // 프로그램 실행 후 10초뒤 종료
		System.out.println("작업 종료");
		
	}
}

class Work1 extends TimerTask{

	@Override
	public void run() {
		System.out.println("Work1 실행");
		
	}
	
}

class Work2 extends TimerTask{

	@Override
	public void run() {
		System.out.println("Work2 실행");
		
	}
	
}
