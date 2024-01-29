package day30;

public class ThorwEx1 {
	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의 예외"); // 생성자 매개변수 생성
			throw e; // 고의적으로 예외를 던진다.
		} catch (Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
		
	}
}
