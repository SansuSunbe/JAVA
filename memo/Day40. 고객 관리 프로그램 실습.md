
- HashMap을 이용한 실습
	- 사용자의 이름과 전화번호를 저장하는 전화번호부 만들기
		1.고객 저장
		2.고객 검색
		3.전체 보기
		4.끝내기

- HashMap 정리
	1. 생성
		~~~
		HashMap<genericType> 객체명 = new HashMap<>();
		~~~ 
	2. 삽입
		~~~
		변수명.put(Key, Value);
		~~~ 
	 3. 가져오기
		 ~~~
		 변수명.get(key);
		 ~~~ 
	4. key 존재 확인
		~~~
		변수명.containsKey(key);
		~~~

- 실습 소스 코드
 ~~~
import java.util.*;

public class PhoneBookMain {
	// 전역변수로 사용하기 위해 static을 붙인다.
	static HashMap<String, String> map = new HashMap<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int choice;

		while (true) {
			System.out.println("전화번호부");
			System.out.println("1.고객 정보 저장");
			System.out.println("2.고객 정보 검색");
			System.out.println("3.고객 정보 출력");
			System.out.println("4.끝내기");
			System.out.println("번호 입력 : ");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("--- 고객 정보 저장 ---");
				insert();
			} else if (choice == 2) {
				System.out.println("--- 고객 정보 검색 ---");
				search();
			} else if (choice == 3) {
				System.out.println("--- 고객 정보 출력 ---");
				show();
			} else if (choice == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 입력");
			}
		}

	}

	public static void insert() {
		String name, phone;
		System.out.println("저장할 고객의 이름 : ");
		name = sc.next();
		// name은 Key이므로, 중복 허용불가
		if (map.containsKey(name)) {
			System.out.println("이미 존재하는 이름");
			return;
		} else {
			System.out.println("저장할 고객의 번호 : ");
			phone = sc.next();
			map.put(name, phone);
			System.out.println("저장 완료");
		}
	}

	public static void search() {
		String searchName;
		System.out.println("검색할 이름 : ");
		searchName = sc.next();
		// searchName이 map에 존재해야 검색 가능
		if (map.containsKey(searchName)) {
			System.out.println("검색 완료");
			System.out.println("검색된 전화 번호 : " + map.get(searchName));
		} else {
			System.out.println("검색된 이름 없음");
		}
	}

	public static void show() {
		Set<String> keyset = map.keySet();
		Iterator i = keyset.iterator();
		while (i.hasNext()) {
			String curName = (String) i.next();
			System.out.println("name : " + curName + ", phone : " + map.get(curName));
		}
	}
}
~~~
