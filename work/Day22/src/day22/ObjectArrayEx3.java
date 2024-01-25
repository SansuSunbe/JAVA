package day22;

import java.util.Scanner;

public class ObjectArrayEx3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		User users[] = new User[4];

		for (int i = 0; i < 4; i++) {
			users[i] = new User();
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("name : ");
			users[i].name = sc.next();
			System.out.println("phone ; ");
			users[i].phone = sc.next();
			System.out.println("age ; ");
			users[i].age = sc.nextInt();
			System.out.println("gender : ");
			users[i].gender = sc.next();
		}

		for (int i = 0; i < 4; i++) {
			users[i].info();
		}

		sc.close();

	}
}

class User {
	String name; // 이름
	String phone; // 전화번호
	int age; // 나이
	String gender; // 성별

	void info() {
		System.out.println("name ; " + name);
		System.out.println("phone ; " + phone);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
	}
}
