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
