package day26;

public class AbstractEx2 {
	public static void main(String[] args) {

		Pokemon pokemon = new Pikachu();
		System.out.println("포켓몬 : " + pokemon.getName());
		pokemon.attack();
		pokemon.sound();

		pokemon = new Ggobugi();
		System.out.println("포켓몬 : " + pokemon.getName());
		pokemon.attack();
		pokemon.sound();

	}
}

abstract class Pokemon {
	String name;

	abstract void attack();

	abstract void sound();

	public String getName() {
		return this.name;
	}
}

class Pikachu extends Pokemon {

	Pikachu() {
		this.name = "피카츄";
	}

	@Override
	void attack() {
		System.out.println("백만 볼트");

	}

	@Override
	void sound() {
		System.out.println("피카");

	}
}

class Ggobugi extends Pokemon {

	Ggobugi() {
		this.name = "꼬부기";
	}

	@Override
	void attack() {
		System.out.println("물대포");

	}

	@Override
	void sound() {
		System.out.println("꼬북");

	}

}