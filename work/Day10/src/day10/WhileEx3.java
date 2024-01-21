package day10;

import java.util.*; // util 패키지에 있는 모든 클래스 import

public class WhileEx3 {
	public static void main(String[] args) {
		
		// UP & DOWN 게임 만들
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int num = random.nextInt(100) + 1; // 1 ~ 100까지의 난수 생성
		int user = -1;
		
		while(user != num) {
			System.out.println("숫자 입력 : ");
			user = sc.nextInt();
			if(user == num) {
				System.out.println("정답");
			} else if(user > num) {
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}
		}
		
		
	}
}
