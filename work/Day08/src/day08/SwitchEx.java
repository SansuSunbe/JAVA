package day08;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {

		// 일 년동안 읽은 책 수에 따라 멘트 출력

		Scanner sc = new Scanner(System.in);

		int book = sc.nextInt();

		switch (book/10) { // 식을 넣는 것도 가능
		case 1:
			System.out.println("10권 미만");
			break;
		case 2:
			System.out.println("10권 이상");
			break;
		case 3:
			System.out.println("20권 이상 30권 미만");
			break;
		default:
			System.out.println("30 이상");

		}
		
		sc.close();

	}
}
