package day25;

public class PolymorphismEx1 {
	public static void main(String[] args) {
		
		// Polymorphism : 다형성
		
		A obj = new B(); // 부모 변수 = 자식 값 : 업 캐스팅
		obj.methodA();
//		obj.methodB(); 에러 발생
		
	}
}

class A{
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A{
	void methodB() {
		System.out.println("methodB");
	}
}
