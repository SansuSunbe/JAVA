package day33;

import java.util.Date;

public class DataClassEx5 {
	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today); // 한국 날짜 기준
		long a = System.currentTimeMillis();
		Date today2 = new Date();
		System.out.println(today2);
		
	}
}
