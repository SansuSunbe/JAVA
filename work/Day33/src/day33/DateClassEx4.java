package day33;

import java.util.Calendar;

public class DateClassEx4 {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		Calendar endOfYear = Calendar.getInstance();
		Calendar christmas = Calendar.getInstance();
		
		endOfYear.set(Calendar.MONTH, 11); // month : 12월
		endOfYear.set(Calendar.DATE, 31); // date : 31일
		long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis();
		System.out.println("연말까지 남은 날 : " + diff / (24 * 60 * 60 * 1000) + "일"); // 24시간 * 60분 * 60초 * 1000ms
		
		christmas.set(2024, 11, 25); // 2024년 12월 25일
		diff = christmas.getTimeInMillis() - today.getTimeInMillis();
		System.out.println("크리스마스까지 남은 날 : " + diff / (24 * 60 * 60 * 1000) + "일");
	}
}
