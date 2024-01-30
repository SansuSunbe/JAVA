package day34;

import java.time.LocalTime;

public class WithPrac2 {
	public static void main(String[] args) {
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalTime new_localTime = localTime.withHour(3).withMinute(25).withSecond(24).withNano(33333);
		System.out.println(new_localTime);
		
	}
}
