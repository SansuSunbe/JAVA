
- Queue(큐)
	- 한 쪽 끝에서는 삽입이, 다른 쪽 끝에서는 삭제가 일어나는 구조
	- 선입선출(FirstInFirstOut)
	- front : 먼저 들어온 데이터
		- 삭제
	- rear : 나중에 들어온 데이터
		- 삽입
	- 인터페이스이므로 업캐스팅 후 사용가능

- Queue와 관련된 메서드
	- boolean add(E e)
		- Queue에 요소 e 추가
	- element()
		- Queue의 제일 상단 요소 반환
	- remove()
		- Queue의 최상단 요소를  반환 후 제거
	- boolean offer(E e)
		- Queue에 요소 e를 추가
	- peek()
		- Queue의 제일 상단 요소 반환
	- poll()
		- Queue의 최상단 요소를 반환 후 제거

- ex) Queue 예시
	
	- ![](https://i.imgur.com/Rw4e4BG.png)


- Stack(스택)이란?
	- 한 쪽 끝에서 삽입과 삭제가 모두 일어나는 구조
	- 후입선출(LastInFirstOut)
	- 즉 나중에 들어온게 먼저 나감
	- top(상단)에서 삽입과 삭제가 일어난다.
	- Queue와 다르게 클래스 이므로 바로 객체화 한 후 사용 가능

- Stack과 관련된 메서드
	- peek()
		- top(상단)요소 반환
	- pop()
		- top 요소 제거 후 반환
	- push(E item)
		- top에 요소 추가
	- int search(Object obj)
		- 요소 obj가 있는지 검색해서 위치 반환

- ex) stack 예시

	- ![](https://i.imgur.com/R64g6G2.png)
