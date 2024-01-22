
- 로또 프로그램 알고리즘
	1. 6개의 랜덤의 숫자와 보너스 점수를 로또 배열에 저장한다.
	2. 사용자에게 1 ~ 45 까지의 6개의 숫자를 입력받아 배열에 저장한다.
	3. 사용자에게 보너스 점수를 입력받는다.
	4. 사용자가 입력한 값과 로또 배열에 있는 값을 비교하여 동일한 값의
		개수를 count 한다.
	5. 몇 개의 숫자를 맞췄는지 다음과 같은 조건에 따라 등수를 출력한다.
		1. 6개의 숫자 다 맞히면 1등
		2. 6개의 숫자 중 5개의 숫자와 보너스 번호를 맞히면 2등
		3. 6개의 숫자 중 5개의 숫자를 맞히면 3등
		4. 6개의 숫자 중 4개의 숫자를 맞히면 4등
		5. 6개의 숫자 중 3개의 숫자를 맞히면 5등

- 필요한 라이브러리 파악
	- 난수를 출력하기 때문에 Random 클래스 필요
	- 입력을 받아야하기 떄문에 Scanner 클래스 필요

- 소스코드
 ~~~
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
public static void main(String[] args) {

Random random = new Random();
Scanner sc = new Scanner(System.in);

// 배열 선언과 생성 동시에 크기 초기화
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

sc.close();

  

	}

}
 ~~~
		