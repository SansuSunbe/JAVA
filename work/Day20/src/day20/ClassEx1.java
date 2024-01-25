package day20;

public class ClassEx1 {
	public static void main(String[] args) {
		
		// 자료형 변수 = 객체값;
		// 클래스명 참조변수 = new 클래스명;
		ClassA classA = new ClassA();
		System.out.println(classA.x); // 객체classA안에 있는 변수 출력
		classA.f1(); // 객체classA안에 있는 메서드 호출
		
		classA.x = 30; // 객체classA안에 있는 변수 수정
		System.out.println(classA.x);
		
	}
}

class ClassA{
	int x = 10;
	void f1() {
		System.out.println("f1()");
	}
}
