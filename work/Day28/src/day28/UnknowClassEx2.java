package day28;

public class UnknowClassEx2 {
	public static void main(String[] args) {
		
		Inter1 inter1 = new Inter1() {
			// 인터페이스를 통해서 익명클래스를 일회성으로 구현 가능
			@Override
			public void f1() {
				System.out.println("inter1 impl f1()");
				
			}
		};
		inter1.f1();
	}
}

interface Inter1 {
	void f1();
}

// Inter1을 구현하는 일반 클래스
class InterImpl implements Inter1 {

	@Override
	public void f1() {

	}

}
