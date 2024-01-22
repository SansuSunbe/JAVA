package day13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int lottoArr[] = new int[6];
		int userArr[] = new int[6];

		int bonus, userBonus;
		int count = 0;

		for (int i = 0; i < 6; i++) {
			lottoArr[i] = random.nextInt(45) + 1; // 1 ~ 45까지의 난수 생성
		}

		// bonus = random
		bonus = random.nextInt(45) + 1;

		System.out.println("Lotto : " + Arrays.toString(lottoArr) + ", bonus : " + bonus);

		// 사용자에게 6개의 값을 입력
		System.out.println("숫자 6개 입력 : ");
		for (int i = 0; i < 6; i++) {
			userArr[i] = sc.nextInt();
		}

		System.out.println("보너스 값 입력 : ");
		userBonus = sc.nextInt();
		System.out.println("user : " + Arrays.toString(userArr) + "bonus : " + userBonus);
		// 로또 배열의 값과 사용자 배열의 값 중 같은 값이 몇 개 있는지 카운트
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lottoArr[0] == userArr[i]) {
					count++;
				}
			}
		}
		System.out.println("총 맞은 갯수 : " + count);
		// count의 갯수에 따라서 등수 정하
		if (count == 6) {
			System.out.println("1등");
		} else if (count == 5) {
			if (bonus == userBonus) {
				System.out.println("2등");
			} else {
				System.out.println("3등");
			}
		} else if (count == 4) {
			System.out.println("4등");
		} else if (count == 3) {
			System.out.println("5");
		} else {
			System.out.println("꽝");
		}

	}
}
