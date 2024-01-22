
- 배열이란?
	- 같은 자료형의 변수들의 나열된 묶음
	- 사용목적 : 같은 타입의 변수들의 관리를 편하게  하기 위해서

- 배열의 선언과 생성
	1) 타입  [] 배열명;
	2) 배열명 = new 타입 [길이];
	- ex1)
		~~~
		int [] arr;
		arr = new int [3];
		~~~
	3) 타입 [] 배열명 = new 타입 [길이];
		- 선언과 생성을 동시에 하여 초기화
	- ex2) 
		~~~
		int [] arr = new int [3];
		~~~


- 인덱스(index)
	- 배열의 값을 다루기 위해선 인덱스(index)를 사용
	- 배열의 위치 값을 뜻 함
	- 배열의 인덱스로 배열의 값을 변수처럼 사용 가능
	- 배열의 시작번호는 0부터 시작

- 배열 생성 시 배열의 값은 배열의 타입에 해당하는 기본값으로 초기화
	- int 형 배열의 초기 값 : 0
	- char 형 배열의 초기 값 : ''
	- float, double 형 배열의 초기 값 : 0.0
	- String 형 배열의 초기 값 : Null
	- ex1)
		- ![](https://i.imgur.com/KW6JHnf.jpg)


- ex1 배열과 for문을 사용하여 학생 점수 출력)
	- ![](https://i.imgur.com/6SLZcJK.png)

- ex2 학생의 성적을 배열로 선언, 생성, 초기화를 동시에 하여 평균 출력하기)
	- ![](https://i.imgur.com/Cl16Ehu.png)


- 배열의 사용
	- 배열명.length : 배열의 길이를 구함
	- Arrays.toString(배열명) : 배열의 요소를 문자열로 출력
	- ex1) 
		- ![](https://i.imgur.com/qHUCIjJ.jpg)


