package day34;

import java.time.LocalDate;

public class TimePlus {
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate); // 현재 날짜 출력
		// 연, 월, 일 빼기, 더하기, 빼기 계산
		LocalDate localDate2 = localDate.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(localDate2);
		
		// 자동변환
		LocalDate localDate3 = localDate2.minusDays(22);
		System.out.println(localDate3);
		
		// 주 더하기
		LocalDate localDate4 = localDate3.plusWeeks(3);
		System.out.println(localDate4);
	}
}
