package day21;

public class InstanceClassEx2 {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		System.out.println(car1.speed);
		
		System.out.println("<변경 전>");
		System.out.println("car1.speed : " + car1.speed);
		System.out.println("car2.speed : " + car2.speed);
		System.out.println("car1.wheel : " + car1.wheel);
		System.out.println("car2.wheel : " + car2.wheel);
		
		car2.speed = 100;
		car2.wheel = 6;
		
		System.out.println("<변경 후>");
		System.out.println("car1.speed : " + car1.speed);
		System.out.println("car2.speed : " + car2.speed);
		System.out.println("car1.wheel : " + car1.wheel);
		System.out.println("car2.wheel : " + car2.wheel);
		
		
		
	}
}

class Car{
	static int wheel = 4; // 클래스 변수
	int speed; // 인스턴스 변수
}
