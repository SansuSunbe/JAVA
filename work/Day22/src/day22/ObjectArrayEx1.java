package day22;

public class ObjectArrayEx1 {
	public static void main(String[] args) {
		
		// 클래스명 객체배열명 [] = new 클래스명[크기];
		Aclass arr [] = new Aclass[3];
		arr[0] = new Aclass(); // 클래스명(); 을 통해 객체를 생성해야만 객체 내 필드 접근 가능
		arr[0].x = 100;
		arr[0].f1();
		System.out.println(arr[0].x);
		
	}
}

class Aclass{
	int x;
	void f1() {
		System.out.println("f1()");
	}
}
