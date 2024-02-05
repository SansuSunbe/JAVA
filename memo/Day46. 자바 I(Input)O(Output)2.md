
- 문자 기반 스트림이란?
	- 16bit의 문자나 문자열을 읽고 쓰는 스트림

- 문자 기반 스트림의 활용
	- 자바에서 사용하는 char형 변수는 2byte이므로 바이트 기반 스트림은 불편하므로, 문자 단위로 입출력을 다루는 문자 기반 스트림을 제공

- Reader
	- int read()
	- int read(char [] cbuf)
	- abstract int read(char [] cbuf, int off, int len)

- Writer
	- void write(int c)
	- void write(char [] cbuf)
	- abstract void write(char [] cbuf, int off, int len)
	- void write(String str)
	- void write(String str, int off, int len)

- 대상에 따른 스트림 종류
	- InputStream(입력 스트림)
		- FileReader 대상 : 파일
		- PipedReader 대상 : 메모리
		- CharArrayReader 대상 : 프로세스

	- OutputStream(출력 스트림)
		- FileWriter 대상 : 파일
		- PipedWriter 대상 : 메모리 
		- CharArrayWriter 대상 : 프로세스 

- 문자 기반 보조스트림이란?
	- 문자 기반 스트림의 성능을 향상시키는 역할

- 문자 기반 보조 스트림의 활용
	- ![](https://i.imgur.com/vJvxLRP.png)

- 객체 직렬화
	- 자바 시스템 내부에서 사용하는 객체나 데이터를 외부의 시스템에서 사용할 수 있도록 byte 단위의 데이터로 변환시키는 기술과 바이트로 변환된 데이터를 다시 객체로 변환하는 기술

 - 객체 전송의 단계
	 1. 직렬화된 객체를 바이트 단위로 분해한다.(marshalling)
	 2. 직렬화 되어 분해된 데이터를 순서에 따라 전송
	 3. 전송받은 데이터를 복구(unmarshalling)

- 마샬링(marshalling)이란?
	- 데이터를 바이트(byte) 단위의 데이터로 변환시키는 작업

- 마샬링을 적용할 수 있는 데이터
	- 기본자료형
	- Serializable 인터페이스를 구현한 클래스로 만들어진 객체
		~~~
		class A implements Serializable{
			필드
		}
		A a = new A();
		~~~ 

- 직렬화(Serializable)
	- Serializable 인터페이스는 메서드 없이 JVM에게 정보 전달 기능만 존재

- 언마샬링(unmarshalling)
	- 객체 스트림을 통해 전달된 바이트(byte) 단위의 데이터를 원래의 객체로 복구하는 작업
	- 어떤 객체 형태로 복구할 지 형 변환을 명확하게 명시해야한다.

- ex)
	- ![](https://i.imgur.com/1hJlCvS.png)

- ex) 파일 복사 하기
	- 코딩
	- ![](https://i.imgur.com/C03Y7iV.png)

	- prac.txt 생성 후 실행하고 프로젝트 새로고침을 하면 result.txt가 생기면서 prac.txt에 있는 내용이 복사된다.
	- ![](https://i.imgur.com/CTj8Yur.png)
