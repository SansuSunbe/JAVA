package day21;

public class InstanceClassEx1 {
	public static void main(String[] args) {
		
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		member1.name = "김철수";
		member1.age = 32;
		member1.gender = "남자";
		
		member2.name = "홍길동";
		member2.age = 30;
		member2.gender = "남자";
		
		member3.name = "김여사";
		member3.age = 50;
		member3.gender = "여자";
		
		member4.name = "고길동";
		member4.age = 34;
		member4.gender = "남자";
		
		// 클래스
		Member.centerName = "World"; // 모든 CenterName 변경
		
		System.out.println("member1-----");
		member1.info();
		System.out.println("member2-----");
		member2.info();
		System.out.println("member3-----");
		member3.info();
		System.out.println("member4-----");
		member4.info();
		
		
	}
}

class Member{
	// 인스턴스 변수 선언
	static String centerName = "hello"; // 고정적으로 사용할 클래스변수
	String name;
	int age;
	String gender;
	
	void info() { // 메서드 생성
		System.out.println("Center Name : " + centerName);
		System.out.println("Name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
	}
}
