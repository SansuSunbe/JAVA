package day06;
// 자동import : Ctrl + Shift + O
import java.util.Scanner;

public class Traffic_Light {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("신호등");
		System.out.println("신호 입력");
		System.out.println("빨간불 : 1, 초록불 : 2 노란불 : 3");
		int sign = sc.nextInt();
		String result = sign == 1 ? "정지" : sign == 2 ? "출발" : "서행";
		// 1번 입력시 참인 정지 값 출력
		// 2 or 3번 입력시 false 값
		// false값 안에 2번은 true 3번은 false로 나뉨
		System.out.println(result);
		
		sc.close();
		
	}
}
