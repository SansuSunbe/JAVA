package day07;

import java.util.Scanner;

public class If_else_if {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		
		int age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("성인");
			System.out.println("성인 요금");
		} else if(age > 13) { // 13 < age <= 19
			System.out.println("청소년");
			System.out.println("청소년 요금");
		} else if(age > 8) { // 8 < age <= 13
			System.out.println("어린이");
			System.out.println("어린이 요금");
		} else { // age <= 8
			System.out.println("유아");
			System.out.println("무료");
		}
		System.out.println("결제");
		
		sc.close();
		
	}
}
