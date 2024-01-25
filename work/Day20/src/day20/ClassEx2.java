package day20;

public class ClassEx2 {
	public static void main(String[] args) {

		Car car = new Car();
		System.out.println("시동 초기화 : " + car.powerOn);
		System.out.println("색상 초기화 : " + car.color);
		System.out.println("휠 수 초기화 : " + car.wheel);
		System.out.println("속력 초기화 : " + car.speed);
		System.out.println("와이퍼 작동 초기화 : " + car.wiperOn);

		car.power();
		System.out.println("파워 메서드 동작 : " + car.powerOn);

		car.power();
		System.out.println("파워 메서드 재동작 : " + car.powerOn);

		car.color = "BLACK";
		System.out.println("현재 차의 색상 : " + car.color);

	}
}

class Car {
	boolean powerOn; // 시동
	String color; // 색상
	int wheel; // 휠 수
	int speed; // 속력
	boolean wiperOn; // 와이퍼

	void power() {
		powerOn = !powerOn; // true -> false, false -> true
	}

	void speedUp() {
		speed++;
	}

	void speedDown() {
		speed--;
	}

	void wiper() {
		wiperOn = !wiperOn; // true -> false, false -> true
	}
}
