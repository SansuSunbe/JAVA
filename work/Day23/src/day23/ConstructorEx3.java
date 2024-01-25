package day23;

public class ConstructorEx3 {
	public static void main(String[] args) {
		
		Bclass bClass1 = new Bclass("홍길동");
		Bclass bClass2 = new Bclass();
//		Bclass bClass2 = new Bclass();
		System.out.println(bClass1.name);
		System.out.println(bClass1);
		
		bClass2.name = "호출";
		System.out.println("bClass2 의 디폴트 생성자 : " + bClass2.name);
		
	}
}

class Bclass{
	String name; // 멤버변수
	// 생성자 오버로딩 : 여러개의 생성자를 중복정의 
	Bclass(){} // 디폴트 생성자
	Bclass(String name2){ // 매개변수 생성자
		System.out.println("Bclass의 매개변수 생성자()");
		this.name = name2;
	}
}
