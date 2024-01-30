
- Wrapper 클래스
	- 기본 자료형들을 객체로 다루는데 사용
	- 자바는 객체 지향이므로, 객체 값을 다룰 일이 많기 때문에, 일반자료형의 데이터를 객체로 변환하는 작업이 필요

- 자료형 (자료형 : Wrapper 클래스)
	- boolean : Boolean 클래스
	- char : Charater 클래스
	- byte : Byte 클래스
	- short : Short 클래스
	- int : Integer 클래스
	- long : Long 클래스
	- double : Double 클래스
	- float : Float 클래스

- 문법 (jdk9 버전부터는 Wrapper 클래스의 생성자 사용을 권장하지 않음)
	~~~
	Wrapper클래스명 객체명 = new Wrapper클래스명(값); 
	~~~
	ex)
	~~~
	Integer i = new Integer(3);
	Double d = new Double(3.14);
	~~~

- ex) Wrapper 클래스 객체 생성 예시

	- ![](https://i.imgur.com/2iVQzQn.png)

- ex) Integer -> int 변환 예시

	- ![](https://i.imgur.com/GYZwYoU.png)


- 오토박싱(Auto Boxing)
	- 기본 자료형 값을 자동으로 Wrapper 클래스의 객체로 변환시켜 주는 것

- 오토 언박싱(Auto UnBoxing)
	- Wrapper 클래스의 객체 값을 자동으로 기본 자료형 값으로 변환시켜 주는 것

- ex) 오토박싱, 오토언박싱 예시

	- ![](https://i.imgur.com/ScFVmfO.png)

- Random 클래스
	- 무작위의 값을 얻고 싶을 때 사용하는 클래스
	- 내부적으로 무작위의 값을 추출하기 위한 내부 알고리즘이 존재한다.
	~~~
	Random 객체명 = new Random();
	~~~ 

- Random 클래스의 생성자 종류
	- Random() 
		- 현재 시간을 seed 값으로 인스턴스(객체) 생성
	- Random(int seed)
		- 받아오는 seed 값으로 인스턴스 생성

- Random 클래스의 관련 메서드
	- int nextInt()
		- 무작위의 int 값을 반환
	- int nextInt(int n)
		- 0보다 크고 n보다 작은 int 값 반환
	- boolean nextBoolean()
		- 무작위의 boolean 값 반환
	- long nextLong()
		- 무작위의 Long 값 반환
	- double nextDouble()
		- 무작위의 double 값 반환
	- float nextFloat()
		- 무작위의 float 값 반환

- ex) Random 클래스 예시

	- ![](https://i.imgur.com/YGCCp9F.png)
