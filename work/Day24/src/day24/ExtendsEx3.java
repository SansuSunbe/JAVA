package day24;

public class ExtendsEx3 {
	public static void main(String[] args) {
		
		Leader leader = new Leader();
		leader.say();
		
	}
}

class Student2{
	void lean() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("인사");
	}
}

class Leader extends Student2{
	void lead() {
		
	}
	void say() { // 메서드 오버라이딩
		System.out.println("인사하기");
		super.say();
	}
}
