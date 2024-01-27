package day27;

public class InterfaceEx1 {
	public static void main(String[] args) {

		B b = new B();
		b.methodA();
		b.methodB();

	}
}

interface InterA {
	int x = 10; // final 키워드 생략 가능
	int y = 20;

	abstract void methodA();

	void methodB(); // abstract 키워드도 생략 가능
}

class B implements InterA {

	@Override
	public void methodA() {
		System.out.println("methodA()");

	}

	@Override
	public void methodB() {
		System.out.println("methodB()");

	}

}