
- Set(집합)이란?
	- 요소들을 집합적으로 모아놓은 자료구조
	- 중복을 허용하지 않는다.
	- 저장 순서를 유지하지 않는다.
	- 중복된 요소add()

- Set을 구현한 클래스
	- HashSet
		- Set과 동일하게 중복이 없고, 순서가 없다.
		- ![](https://i.imgur.com/r9qfxlm.png)
			
	- TreeSet
		- Set과 동일하게 중복이 없으나, 정렬기능이 추가된 형태
		- ![](https://i.imgur.com/4JwCSGx.png)

- ex) HashSet, TreeSet 객체 생성 후 요소 추가

	- ![](https://i.imgur.com/aJtc2ID.png)

	- 값 출력하기

	- ![](https://i.imgur.com/UHAzi7q.png)

- List(리스트)란?
	- 데이터를 일렬로 늘어놓은 구조
	- 순서가 있다.
	- 중복을 허용한다.

- List 인터페이스를 구현한 클래스
	- ArrayList
		- 요소 추가 시 0번 인덱스부터 차례대로 요소 저장(배열에서 발전된 형태)
	- LinkedList
		- 요소들이 서로 연결되어 있는 리스트(각 요소가 다음 요소의 주소를 저장)

- List인터페이스의 주요 메서드
 
	- ![](https://i.imgur.com/X7hQcKN.png)

- ex) ArrayList 예시

	- ![](https://i.imgur.com/LZXeHz8.png)

- ex) LinkedList와 ArrayList 속도 차이

	- ![](https://i.imgur.com/O0XztH8.png)
