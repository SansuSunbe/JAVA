package day14;

import java.util.Scanner;

public class MultiArray_Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int score[][] = new int[4][3];

		// for문에서 사용하기 위한 문자열 배열 생성
		String subject[] = { "국어", "영어", "수학" };

		// 2차원 배열을 활용해서 사용자에게 입력받은 값을 저장하는 방법
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + "번 학생 점수 ---");
			for (int j = 0; j < 3; j++) {
				System.out.println(subject[j] + " : ");
				score[i][j] = sc.nextInt();
			}
		}
		
		// 2차원배열에 저장된 값을 출력하기
		for(int i = 0; i < 3; i++) {
			System.out.print("\t" + subject[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(i + 1 + "번  : \t");
			for(int j = 0; j < 3; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();

	}
}
