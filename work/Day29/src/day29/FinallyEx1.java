package day29;

public class FinallyEx1 {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 2;
		try {
			System.out.println("외부 접속");
			int c = b / 3;
		} catch (ArithmeticException e) {
			System.out.println("오류 발생");
		} finally {
			System.out.println("연결 해체"); // 무조건 실행
		}
		
	}
}
