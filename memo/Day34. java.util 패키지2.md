
- java.time 패키지란?
	- 자바에서 날짜와 시간을 다루기 위한 패키지

- java.time 패키지의 하위 패키지
	- jdk 1.8부터 추가된 패키지로서 기존의 Date와 Calendar를 보완
	- java.time
		- 날짜와 시간을 나타내는 LocalDate, LocalTime등을 포함한 패키지
	- java.time.format
		- 날짜와 시간을 파싱하고 포멧팅하는 API포함
	- java.time.chrono
		- 여러가지 달력 시스템을 사용할 수 있는 API
	- java.time.temporal
		- 날짜와 시간을 연산하기 위한 API포함
	- java.time.zone
		- 타임존을 지원하는 API 포함

- LocalDate 클래스
	- 시간 정보를 저장
	- 현재 시간 지정 : now() 메서드 사용
	- 특정 시간 지정 : of() 메서드 사용
	~~~
	LocalDate 객체명 = LocalDate.now();
	LocalDate 객체명 = LocalDate.of(int year, int month, int dayOfMonth);
	~~~ 
	- of() 메서드의 오버로딩
	~~~
	of(int hour, int minute);
	of(int hour, int minute, int second);
	of(int hour, int minute, int second, int nanoOfSecond);
	~~~ 

- LocalDateTime 클래스
	- LocalDate클래스와 LocalTime클래스를 결합한 클래스
	- 날짜 정보와 시간 정보 모두 저장

- ZonedDateTime 클래스
	- ISO-8601 달력 시스템에서 정의하는 TimeZone에 따라 날짜와 시간 저장
	- 형식 : 2024-01-08T12:56:09:017+09:00(Asia/Seoul)
	- 협정 세계시(UTC)와 차이 나는 시간(존 오프셋)이 따로 저장
	- ZoneDateTime클래스는 now() 메서드 뒤에 ZoneId를 매개값으로 넘겨야 함
	~~~
	ZoneDateTime 객체명 = ZoneDateTime.now(ZoneId.of("UTC"));
	~~~ 

- Instant 클래스
	- 특정 시점의 타임 스탬프 객체
	- 1970년 1월 1일부터 현재까지의 시간을 세는 객체
	- Machine time에 유리하다
	~~~
	Instant 객체명 = Instant.now();
	~~~ 

- LocalDate/LocalTime 클래스와 Calendar 클래스와의 차이
	- Calendar 클래스는 1월이 0으로 시작하나,
	- LocalDate 1월이 1로 시작한다.

- ex) 날짜 사칙연산 예시

	- ![](https://i.imgur.com/owFDk9m.png)

- ex) 날짜와 시간 변경 예시

	- ![](https://i.imgur.com/mGOrrIY.png)

- ex) 윤년 횟수 구하기

	- ![](https://i.imgur.com/VAOG5Mt.png)

- with() 메서드
	- TemporalAbjuster 타입을 인자로 받으면 특정한 날짜를 리턴

- Timer, TimerTask 클래스란?
	- 개발자가 원하는 특정한 시간에 코드를 실행하거나 특정 시간 간격으로 반복되는 작업 처리
	1. TimerTask를 상속받는 새로운 클래스 선언
		~~~
		class 클래스명 extends TimerTask{
			필드
		}
		~~~ 
	2. TimerTask 클래스의 run 추상 메서드에서 하고싶은 작업 오버라이딩
		~~~
		public void run(){
			필드
		}
		~~~ 
	3. Timer객체 생성 후 원하는 시간을 매개변수 값으로 전달
		~~~
		Timer 객체명 = new Timer(true); // 프로그램 종료 시, 객체 자동 소멸
		TimerTask 객체명 = new 클래스명();
		객체명.schedule(객체명, 5000); // 1000 = 1초
		~~~ 

- ex) TimerTask를 상속받는 클래스 생성

	- ![](https://i.imgur.com/mhVJRZS.png)

- ex) TimerTask를 상속받는 클래스를 실행 및 출력 이 때 Thread.sleep을 사용해서 프로그램 종료 시점 조정

	- ![](https://i.imgur.com/vaP6cWe.png)
