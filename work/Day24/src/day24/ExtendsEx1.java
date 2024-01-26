package day24;

public class ExtendsEx1 {
	public static void main(String[] args) {
		
		Student student = new Student();
		Teacher teachaer = new Teacher();
		
		student.breath();
		student.learn();
		
		teachaer.eat();
		teachaer.teach();
		
	}
}

class Person{
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}

class Student extends Person{
	void learn() {
		System.out.println("배우기"); 
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}
