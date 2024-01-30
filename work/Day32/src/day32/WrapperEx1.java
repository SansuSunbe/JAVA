package day32;

public class WrapperEx1 {
	public static void main(String[] args) {
		
		// jdk 9버전부터는 Wrapper 클래스의 생성자 사용을 권장하지 않는다.
		int i = 30;
		Integer ii = new Integer(i);
		System.out.println(ii);
		
		double d = 3.14;
		Double dd = new Double(d);
		System.out.println(dd);
		
	}
}
