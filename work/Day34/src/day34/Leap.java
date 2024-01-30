package day34;

import java.time.LocalDate;

public class Leap {
	public static void main(String[] args) {
		
		// 윤년구하기
		LocalDate localDate = LocalDate.now();
		LocalDate new_localDate;
		
		int count = 0;
		
		for(int i = 1900; i <= 2100; i++) {
			new_localDate = localDate.withYear(i);
			if(new_localDate.isLeapYear()) {
				System.out.println(new_localDate.getYear() + "윤년");
				count++;
			}
		}
		System.out.println("1900년 ~ 2100년까지 총 윤년 : " + count + "번");
		
	}
}
