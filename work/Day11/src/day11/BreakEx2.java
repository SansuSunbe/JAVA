package day11;

import java.util.Scanner;

public class BreakEx2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, sum = 0;
		while(true) {
			System.out.println("더할 숫자 입력 : (종료 0)");
			i = sc.nextInt();
			if(i == 0) {
				break;
			}
			sum = sum + i;
		}
		System.out.println("현재 총합 = " + sum);
		
		sc.close();
	}
}
