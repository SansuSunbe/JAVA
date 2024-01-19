package day04;

public class Equality_sign_operator {
	public static void main(String[] args) {
		
		double a = 3.14; // 실수형 변수 a에 3.14저장
		double b = 5.15; // 실수형 변수 b에 5.14저장
		System.out.println(a == b); // a와 b가 같나?
		System.out.println(a != b); // a와 b가 다른가?
		
		String c1 = "Hello"; // c1이라는 변수에 hello 값 저장
		System.out.println(c1 == "Hello");
		System.out.println(c1.equals("Hello")); // 문자를 할 때 equals() 메서드 사용
		System.out.println(c1.equals("hello")); // 대소문자 비교까지 한다.
		
	}
}
