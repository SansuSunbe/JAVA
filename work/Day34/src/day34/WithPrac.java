package day34;

import java.time.LocalDate;

public class WithPrac {
	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate new_localDate = localDate.withYear(1999).withMonth(8).withDayOfMonth(23);
		System.out.println(new_localDate);

	}
}
