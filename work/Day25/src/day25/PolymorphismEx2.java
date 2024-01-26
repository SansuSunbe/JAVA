package day25;

public class PolymorphismEx2 {
	public static void main(String[] args) {
		
		Animal lion1 = new Lion();
		Animal Tiger1 = new Tiger();
		Animal Monkey1 = new Monkey();
		Zookeeper simson = new Zookeeper();
		
		simson.feed(lion1);
		simson.feed(Tiger1);
		simson.feed(Monkey1);
		
	}
}

class Animal{
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal{
	public String toString() {
		return "사자";
	}
}

class Tiger extends Animal{
	public String toString() {
		return "호랑이";
	}
}

class Monkey extends Animal{
	public String toString() {
		return "원숭이";
	}
}

class Zookeeper{
	void feed(Animal aniaml) {
		System.out.println(aniaml + "에게 먹이주기");
	}
}