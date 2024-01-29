package day30;

public class ThrowEx4 {
	public static void main(String[] args) {

		int age = -19;
		try {
			ticketing(age);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void ticketing(int age) throws AgeException {
		if (age < 0) {
			throw new AgeException("나이 입력이 잘못됨");
		}
	}
}

class AgeException extends Exception {
	public AgeException() {

	}

	public AgeException(String message) {
		super(message); // 부모클래스 생성자에 매개변수 보냄
	}
}
