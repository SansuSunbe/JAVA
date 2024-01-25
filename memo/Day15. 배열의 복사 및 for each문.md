
- 자바에서 배열의 복사를 편하게 하기위해 제공하는 클래스
	- System.array(src, srcPos, dest, destPos, length);
	- src : 복사할 배열
	- srcPos : 복사를 하기 시작할 인덱스(위치)
	- dest : 덮어쓸 배열
	- destPost : 덮어쓰기 시작할 인덱스(위치)
	- length : 복사할 길이
	- ex1) 배열 복사
		- ![](https://i.imgur.com/BpjF5SV.png)

- for each 문
	- 배열을 순환할 시, 반복문보다 편리하게 순환할 수 있는 새로운 문법
	~~~
	for(자료형 변수명 : 배열명){
		변수가 배열을 순환하면서 반복할 명령;
	}
	~~~
	- ex1) for each문 사용하여 배열 값 출력
		- ![](https://i.imgur.com/IN7HXE8.png)
	- ex2) for문 활용
		- ![](https://i.imgur.com/nTbpR78.png)
