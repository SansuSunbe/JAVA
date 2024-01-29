package day30;

public class ThrowEx3 {
	public static void main(String[] args) {

		try {
			System.out.println("외부 try"); // 1
			try {
				System.out.println("내부 try"); // 2
				Exception e = new Exception();
				throw e;
			} catch (Exception e) {
				System.out.println("(내부 try-catch) exception : " + e); // 3
				System.out.println("예외 던지기 한번 더 : ");
				throw e;
			} finally {
				System.out.println("finally 구문 출력"); // 4
			}
		} catch (Exception e) {
			System.out.println("(외부 try-catch) exception : " + e); // 5
		}
		System.out.println("종료");
	}
}
