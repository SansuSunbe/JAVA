package day22;

public class ObjectArrayEx2 {
	public static void main(String[] args) {

		Animal animal[] = new Animal[3];

		for (int i = 0; i < 3; i++) {
			animal[i] = new Animal();
		}

		animal[0].kind = "고양이";
		animal[0].name = "나비";
		animal[0].age = 5;

		animal[1].kind = "강아지";
		animal[1].name = "흰둥이";
		animal[1].age = 3;

		animal[2].kind = "강아지";
		animal[2].name = "바둑이";
		animal[2].age = 7;
		
		for(int i = 0; i < 3; i++) {
			animal[i].info();
		}

	}
}

class Animal {
	String kind; // 종
	String name; // 이름
	int age; // 나이

	void info() {
		System.out.println("kind : " + kind);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}
