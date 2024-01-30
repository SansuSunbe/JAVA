package day33;

import java.util.Calendar;

public class DateClassEx3 {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 1월을 0으로 인식하기 때문에 + 1 해준다.
		int date = calendar.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.print("오늘은 이번주에서 몇 번째 일인가 : ");
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.print("이번 년도에서 오늘이 며칠째인가 : "); // 일요일을 기준으로 계산 일, 월, 화 -> 3
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
		System.out.print("이번 달은 며칠까지 있는가 : ");
		System.out.println(calendar.getActualMaximum(calendar.DATE));
		
		
		
	}
}
