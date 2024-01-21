package day11;

import java.util.Scanner;

public class ContinueEx2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = 10000;
		System.out.println("현재 돈 10000");
		
		while(true) {
			System.out.println("얼마 사용 : ");
			int i = sc.nextInt();
			if(!(0 <= i && i <= money) ) { // 0 이 i 보다 작거나 같지 않고 i가 money보다 작거나같지 않다면
				System.out.println("다시 입력(사용범위 틀림)");
				continue;
			}
			System.out.printf("%d원 남음 \n", money -= i); // money = money - i
			if(money == 0) {
				break;
			}
		}
		System.out.println("모든 돈 사용, 종료");
		
		sc.close();
	}
}
