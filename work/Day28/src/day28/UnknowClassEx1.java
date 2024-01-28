package day28;

public class UnknowClassEx1 {
	public static void main(String[] args) {

		OuterClass1 outerClass1 = new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의된 익명클래스 메서드");
			}
		};
		outerClass1.a();
		OuterClass1 outerClass2 = new OuterClass1();
		outerClass2.a(); // 익명클래스는 1회성

	}
}

class OuterClass1 {
	void a() {
		System.out.println("method a");
	}

	void b() {

	}
}
