package day23;

public class ConstructorEx2 {
	public static void main(String[] args) {
		
		CellPhone phone = new CellPhone();
		System.out.println(phone.model);
		
		System.out.println("--- 아이폰 ---");
		phone.model = "아이폰11";
		phone.color = "RED";
		phone.capacity = 50;
		System.out.println("model :" + phone.model);
		System.out.println("color :" + phone.color);
		System.out.println("capacity :" + phone.capacity);
		
	}
}

class CellPhone{
	String model = "갤럭시s8";
	String color = "BLACK";
	int capacity = 60;
	
	CellPhone(){
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("capacity : " + capacity);
	}
}
