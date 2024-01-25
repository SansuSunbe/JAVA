package day23;

public class ConstructorEx4 {
	public static void main(String[] args) {
		
		Iphone phone1 = new Iphone();
		Iphone phone2 = new Iphone("아이폰12", "RED", 60);
		System.out.println(phone1.capacity);
		System.out.println(phone2.capacity);
		System.out.println("--- 메서드 호출 ---");
		phone1.info(); // 메서드 호출 
		phone2.info();
		
	}
}

class Iphone {
	String model;
	String color;
	int capacity;
	Iphone(){
		// 기본생성자 
	}
	
	// 매개변수 생성자 
	Iphone(String model, String color, int capacity){
		this.model = model;
		this.color = color;
		this.capacity = capacity;
	}
	
	// 메서드 생성 
	void info() {
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("capacity : " + capacity);
	}
}
