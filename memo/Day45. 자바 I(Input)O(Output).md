
- IO란?
	- Input(입력), Output(출력)
	- 입력 : 프로그램에 데이터가 들어오는 것
	- 출력 : 프로그램의 데이터가 나가는 것

- Stream(스트림)이란?
	- 데이터의 흐름

- Stream의 특징
	- 단 방향(한 쪽 방향)이다.
	- FIFO(FirstInFirstOut)의 구조이다.
	- 출력 단위에 따라 바이트 기반스트림과 문자 단위스트림으로 분류된다.
	- 출력단위
		- 1byte -> 바이트 기반 스트림
		- 문자 -> 문자 기반 스트림

- 바이트 기반 스트림이란?
	- 바이트 단위로 데이터를 입출력하는 스트림

- 바이트 기반 스트림의 활용
	- 입력과 출력에 따라, read()와 write()를 구현하여 사용한다.
	- 스트림을 사용할 때 인스턴스 생성 시 적절한 값을 전달한다.
	- ex)
		~~~
		FileInputStream 객체명 = null;
		객체명 = new FileInputStream("파일 위치");
		객체명.read();
		~~~ 
	- 
	- ![](https://i.imgur.com/LkobCcW.png)

	- ![](https://i.imgur.com/TLAGGlf.png)

- 바이트 기반 보조 스트림
	- 실제 바이트 기반 스트림의 성능을 향상시키는 역할

- 바이트 기반 보조스트림의 활용
	- ex) 
		~~~
		FileInputStream fis = null;
		fis = new FileInputStream("파일 위치);
		BufferedInputStream bis = new BufferedInputStream(fis);
		~~~

	- ![](https://i.imgur.com/tcQrgtL.png)

- ex) 예시 prac.txt파일 만들어서 hello world 입력하고 result.txt에 전송하기

	- prac.txt파일 생성 (java project 파일에다 생성)
	- ![](https://i.imgur.com/RV0C7MF.png)
	
	- ![](https://i.imgur.com/5Fveh6y.png)

	- 코딩
	- ![](https://i.imgur.com/HTVQtIX.png)

	- 실행 결과(프로젝트를 새로고침하면 result.txt가 생성됨)
	- ![](https://i.imgur.com/0fLJvvr.png)

	- result.txt에 prac.txt가 입력한 내용이 그대로 입력 된다.
	- prac.txt에 내용 입력
	- ![](https://i.imgur.com/IdgSkUG.png)

	- result.txt에 입력된 내용

	- ![](https://i.imgur.com/s8qg4PR.png)
