package day24;

public class ObjectTest {
	public static void main(String[] args) {
		
		Aclass aClass1 = new Aclass();
		Aclass aClass2 = new Aclass();
		
		// toString() : 객체정보를 문자열로 출력
		System.out.println(aClass1.toString());
		System.out.println(aClass1); // 객체의 메모리 주소 출력
		
		// equeals() : 두 객체가 동일한 가를 비교
		System.out.println(aClass1.equals(aClass1));
		System.out.println(aClass1.equals(aClass2));
		
		// getClass() : 객체의 클래스 정보를 가져옴
		System.out.println(aClass1.getClass());
		System.out.println(aClass2.getClass());
		
	}
}

class Aclass{
	
}
