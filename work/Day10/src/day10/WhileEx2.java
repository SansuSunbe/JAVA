package day10;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String answer = "Y"; // while문이 실행되도록
												// 초기값을 조건이 참일 값을 넣어준다.
		int count = 0;
		while(answer.equals("Y")) {
			System.out.println("음악 재생(Y)");
			answer = sc.next();
			
			if(answer.equals("Y")) {
				System.out.printf("음악 %d번 재생 \n", ++count);
			}
		}
		
		System.out.println("재생 종료");
		// Y이외의 다른 값을 입력시 "재생 종료" 출력
		
	}
}
