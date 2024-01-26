package day25;

public class UpCastingEx1 {
	public static void main(String[] args) {
		
		Student student1 = new Student("고길동", 17, "코딩", 3);
		student1.info();
		student1.study();
		System.out.println(student1.grade);
		
		// 업캐스팅
		Human human1 = new Student("홍길동", 15, "코드리뷰", 2);
		human1.info();
		// 업 캐스팅이 되었기 때문에
		// Human 클래스의 객체 변수는 grade 변수 사용 불가
		// Human 클래스의 객체 변수는 study() 메서드 호출 불가
		// System.out.println(human1.grade);
		
	}
}

class Human{
	String name; // 이름
	int age; // 나이
	String hobby; // 취미
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	} // 컴파일러는 매개변수 생성자를 만들 시 디폴트 생성자를 만들지 않음
	
	void info() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("hobby : " + hobby);
	}
}

class Student extends Human{
	int grade; // 학년
	public Student(String name, int age, String hobby, int grade) {
		super(name, age, hobby); // 자식클래스에서 호출할 부모클래스의 생성자 지정
		this.grade = grade;
	}
	void info() { // 오버라이딩
		super.info();
		System.out.println("grade : " + grade);
	}
	void study() {
		System.out.println("공부중");
	}
}
