
- util(utility)
	- 사용자의 편리성을 향상하는 유용하고 실용적인 소프트웨어

- java.util 패키지란?
	- java 프로그래밍에 유용한 클래스들을 모아둔 것
	- 대표적으로 Date, Calendar가 있으며 자료구조와 관련된 Collection 프레임워크 관련된 클래스들이 포함되어 있다.

- System.currentTimeMills()
	- 현재 운영체제의 시각을 long 타입으로 반환
	- 1970년 1월 1일을 기준으로 현재까지의 시간이며 1/1000 초 단위까지 환산

- ex) System.currentTimeMills() 예시

	- ![](https://i.imgur.com/dqPYiwP.png)

- java.util.Calendar
	- java에서 제공하는 날짜 관리 클래스
	- 추상클래스이므로 직접 인스턴스 생성이 불가하다
	- getInstance() 메서드를 활용하여 객체 생성
	- 싱글톤 패턴(Singleton Pattern) 객체 사용 시 마다 인스턴스를 생성하는 것이 아니라, 하나의 인스턴스로 사용하는 방법

- ex) 현재 날짜 구하기 예시

	- ![](https://i.imgur.com/RSBorly.png)

- ex) 연말까지 남은 날짜, 크리스마스까지 남은 날짜 구하기

	- ![](https://i.imgur.com/7KOUv00.png)

- java.util.Date
	- 자바에서 제공하는 날짜 관리 클래스
	- jdk 1.0부터 제공되는 클래스이나 여러 문제로 대부분의 메서드와 생성자를 사용하지 않는다.

- ex) Date 클래스로 현재 날짜, 시간 구하기

	- ![](https://i.imgur.com/m789vdT.png)

- SimpleDateFormat
	- 날짜를 형식화 하는 클래스
