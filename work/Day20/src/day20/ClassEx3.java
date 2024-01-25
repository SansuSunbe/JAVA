package day20;

public class ClassEx3 {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.color = "RED";
		car2.color = "BLACK";
		
		car1.speedUp();
		car2.wiper();
		
		System.out.println("car1의 색 : " + car1.color);
		System.out.println("car2의 색 : " + car2.color);
		
		System.out.println("car1의 속도 : " + car1.speed);
		System.out.println("car2의 속도 : " + car2.speed);
		
		System.out.println("car1의 와이퍼 작동 여부 : " + car1.wiperOn);
		System.out.println("car2의 와이퍼 작동 여부 : " + car2.wiperOn);
		
	}
}
