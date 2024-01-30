package day32;

public class IntegerWrapperEx {
	public static void main(String[] args) {
		
		Integer ii = 30; // auto boxing
		
		// Integer -> int
		System.out.println(ii.intValue() + 3);
		
		// Integer -> double
		System.out.println(ii.doubleValue());
		
		// Integer -> float
		System.out.println(ii.floatValue());
		
		// Integer -> String 
		// 문자열로 바꾸기 때문에 문자열로 연결이 된다.
		System.out.println(ii.toString() + 3);
		
	}
}
