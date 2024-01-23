
- 카페 키오스크 프로그램

1. 알고리즘 작성
	- 알고리즘 : 문제를 해결하기 위한 절차 과정 
2. 알고리즘 토대로 코드 구현

- 카페 키오스크 기능 알고리즘
	1. 주문하기
		1. 주문가능한 메뉴 출력
		2. 주문 받을 메뉴 입력 받기
		3. 주문한 메뉴의 가격을 총 금액에 누적한다.
		4. 주문한 메뉴를 전체 메뉴리스트에 추가한다.
		5. 주문한 개수를 한 개 증가한다.
	2. 취소하기
		1. 주문한 메뉴리스트를 출력
		2. 그 중에서 취소한 메뉴를 입력받기
		3. 입력 받은 메뉴를 주문리스트에서 제거하기
		4. 입력 받은 메뉴의 금액을 총 금액에서 차감하기
		5. 주문한 개수를 한 개 감소
	3. 결제하기
		1. 결제해야 할 총 금액을 출력하기
		2. 사용자에게 지불할 금액을 입력받기
		3. 지불한 금액과 총 금액을 비교해서 만약 지불한 금액 < 총금액이면 "잔돈이 부족합니다." 출력 후 결제 취소 그게 아니라면, 잔돈과 함께 "계산완료" 출력하기
		4. 총 금액은 0원으로 주문리스트는 비워주기
		5. 전체 개수를 0개로 초기화
	4. 끝내기

- 소스코드
~~~
package day16;

import java.util.Scanner;

public class CafePratice {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 0;
		// 주문은 총 5개까지 가능
		String orderList[] = new String[5];
		int total = 0;
		while (true) {
			System.out.println("★☆★ Cafe ★☆★");
			System.out.println("1. 주문하기");
			System.out.println("2. 취소하기");
			System.out.println("3. 결제하기");
			System.out.println("4. 끝내기");
			System.out.println("입력 : ");

			int num = sc.nextInt();

			if (num == 1) {
				String menuName = ""; // 초기값 설정
				int menuPrice = 0;
				System.out.println("1. 아메리카노\t1500원");
				System.out.println("2. 카페 라떼\t3000원");
				System.out.println("3. 모카 라떼\t3500원");
				System.out.println("4. 아이스티\t2000원");
				System.out.println("주문할 메뉴번호 : ");
				int menuNum = sc.nextInt();
				if (menuNum == 1) {
					menuName = "아메리카노";
					menuPrice = 1500;
				} else if (menuNum == 2) {
					menuName = "카페 라떼";
					menuPrice = 3000;
				} else if (menuNum == 3) {
					menuName = "모카 라떼";
					menuPrice = 3500;
				} else if (menuNum == 4) {
					menuName = "아이스티";
					menuPrice = 2000;
				} else {
					System.out.println("잘못 입력 됨");
					continue; // 잘못 입력 시 반복의 처음으로 돌아감
				}
				total += menuPrice;
				orderList[count] = menuName;
				count++;
				System.out.println("주문한 메뉴 : " + menuName);
				System.out.println("가격 : " + menuPrice);
			} else if (num == 2) {
				System.out.println("--- 주문한 메뉴 리스트 ---");
				for (int i = 0; i < count; i++) {
					System.out.println(i + 1 + "." + orderList[i]);
				}
				System.out.println("취소할 메뉴 번호 : ");
				int cancleNum = sc.nextInt();
				if (1 <= cancleNum && cancleNum <= count) {
					String delMenu = orderList[cancleNum - 1];
					System.out.println(delMenu + "메뉴 삭제");
					for (int i = cancleNum - 1; i < count; i++) {
						orderList[i] = orderList[i + 1];
					}
					if (delMenu.equals("아메리카노")) {
						total -= 1500;
					} else if (delMenu.equals("카페 라떼")) {
						total -= 3000;
					} else if (delMenu.equals("모카 라떼")) {
						total -= 3500;
					} else if (delMenu.equals("아이스티")) {
						total -= 2000;
					}
					count --;
				}
			} else if (num == 3) {
				System.out.println("결제할 금액 : " + total + "원");
				System.out.println("지불할 금액 : ");
				int money = sc.nextInt();
				if(money < total) {
					System.out.println("잔액 부족");
					continue;
				} else {
					System.out.println("잔돈은" + (money - total) + "원 입니다.");
					total = 0;
					for(int i = 0; i < 5; i++) {
						orderList[i] = "";
					}
					count = 0;
				}
			} else if (num == 4) {
				System.out.println("반복 종료");
				break;
			} else {
				System.out.println("잘못 입력됨");
			}
		}
		
		sc.close();

	}
}

~~~
