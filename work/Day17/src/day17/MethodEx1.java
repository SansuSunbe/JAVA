package day17;

public class MethodEx1 {
	public static void main(String[] args) {
		
		open();
		f1(100);
		f1(200);
	}
	
	static void open() {
		System.out.println("명령1");
		System.out.println("명령2");
		System.out.println("명령3");
		System.out.println("명령4");
	}
	static void f1(int x) { // 함수 호출 시 100을 전달받아서, 전달받은 100을 출력
		System.out.println("x : " + x);
	}
	
}
