package day28;

public class InnerClassEx2 {
	public static void main(String[] args) {
		
		OuterClass outerClass = new OuterClass();
		System.out.println("OuterClass의 a의 값 : " + outerClass.a);
		System.out.println("OuterClass의 b의 값 : " + outerClass.b);
		
		System.out.println("--- inner 클래스 접근하기 ---");
		OuterClass outerClass2 = new OuterClass();
		
		OuterClass.Inner i = outerClass2.new Inner();
		
		System.out.println("Inner c의 값 : " + i.c);
		i.innerMethod();
		
		OuterClass.StaticInner staticInner = new OuterClass.StaticInner();
		System.out.println("StaticInner의 d의 값 : " + staticInner.d);
		
//		staticInner.staticMethod(); // static 메서드는 객체를 생성하지 않고 클래스명을 사용해서 호출 가능
		OuterClass.StaticInner.staticMethod();
		
	}
}

class OuterClass{
	int a = 3;
	static int b = 4;
	class Inner{
		int c = 5;
		public void innerMethod() {
			System.out.println("Inner Class");
		}
	}
	
	static class StaticInner{
		int d = 6;
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("Static Inner");
		}
	}
}
