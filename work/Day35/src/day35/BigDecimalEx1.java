package day35;

import java.math.BigDecimal;

public class BigDecimalEx1 {
	public static void main(String[] args) {
		
		double d1 = 24.3953;
		double d2 = 50.343999;
		System.out.println(d1 + d2);
		
		BigDecimal number1 = new BigDecimal(String.valueOf(d1));
		BigDecimal number2 = new BigDecimal(String.valueOf(d2));
		
		System.out.println(number1.add(number2));
	}
}
