package day34;

import java.time.LocalDateTime;

public class TimePlus2 {
	public static void main(String[] args) {
		
		LocalDateTime localDate1 = LocalDateTime.now();
		System.out.println("현재 시간 : " + localDate1);
		
		LocalDateTime localDate2 = localDate1.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("변경 시간 : " + localDate2);
		
		LocalDateTime localDate3 = localDate2.minusHours(24);
		System.out.println("자동 변환 시간 : " + localDate3);
		
	}
}
