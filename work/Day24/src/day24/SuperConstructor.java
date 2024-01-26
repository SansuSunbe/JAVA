package day24;

public class SuperConstructor {
	public static void main(String[] args) {
		
		SportsCar sCar = new SportsCar("red", 300);
		System.out.println(sCar.color);
		System.out.println(sCar.speedLimit);
		
	}
}

class Car{
	int wheel;
	int speed;
	String color;
	Car(String color){
		this.color = color;
	}
}

class SportsCar extends Car{
	int speedLimit;
	SportsCar(String color, int speedLimit){
		super(color);
		this.color = color;
		this.speedLimit = speedLimit;
	}
}
