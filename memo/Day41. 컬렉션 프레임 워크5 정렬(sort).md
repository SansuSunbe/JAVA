
- 정렬 알고리즘이란?
	- 데이터를 순서대로 나열하기 위한 절차적인 과정
	
- 정렬 알고리즘의 종류
	- 선택정렬(Selection Sort)
		- 최소값 혹은 최대값을 선택해서 가장 앞에다가 위치하여 선택할 위치를 이동하며 정렬하는 방법
		- 구현이 쉽다.
		- 다른 정렬에 비해 시간이 오래걸린다.
		- 기본 로직
			1. 정렬되지 않은 인덱스의 맨 앞에서부터 이를 포함한 그 이후의 값 중 가장 작은 값을 찾아 간다.
			2. 가장 작은 값을 찾으면 그 값을 현재 인덱스의 값과 바꿔준다.
			3. 다음 인덱스로 이동하여 위 과정을 반복한다.

	- ex) 선택정렬 예시

		- ![](https://i.imgur.com/uGFs0F2.png)

		-  ![](https://i.imgur.com/E7ZOTBV.png)
	
	- 출력

		- ![](https://i.imgur.com/0fRLDrx.png)


	- 삽입정렬(Insertion Sort)
		- 지정한 값의 삽입할 위치를 찾아 정렬하는 방법
		- 기본 로직
			1. 삽입정렬은 두 번째 인덱스부터 시작
			2. 현재 인덱스는 별도의 변수에 저장
			3. 비교 인덱스 = 현재 인덱스 -1
			4. 인덱스 값 < 비교인덱스의 값
			5. 인덱스 > 비교 인덱스의 값 : 비교 인덱스 --

	- ex) 삽입정렬 예시
		
		- ![](https://i.imgur.com/qzmnoRf.png)

		- ![](https://i.imgur.com/YZWkmev.png)

	- 출력
	 
		- ![](https://i.imgur.com/NqsNN1W.png)


	- 버블정렬(Bubble Sort)
		- 인접한 두 수를 비교해서 큰 수를 뒤로 보내는 알고리즘
		- 정렬과정이 거품이 일어나는 것과 비슷하다 하여 버블이란 이름을 붙임
		- 구현이 쉽고 코드가 직관적이다.
		- 시간이 오래걸린다.

	- ex) 버블정렬 예시

		- ![](https://i.imgur.com/q9cwKVZ.png)
