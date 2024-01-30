package day33;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateClassEx2 {
	public static void main(String[] args) {
		
		Calendar calendar1 = Calendar.getInstance(); // 싱글톤 패턴
		Calendar calendar2 = new GregorianCalendar(); // 캘린터 클래스 불려오는 방법 2
		System.out.println(calendar1.toString());
		System.out.println(calendar2.toString());
		
		
		
	}
}
