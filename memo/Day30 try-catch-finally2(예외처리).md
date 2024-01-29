
- 객체로서의 예외
	- 자바에서 예외는 Exception 클래스의 객체
	- 자바는 객체지향 언어이기에 예외도 객체로 처리한다.
	- 모든 예외 클래스들은 Exception 클래스를 상속받으므로 Exception으로 처리 가능
	- 예외 클래스들에서 Exception 클래스의 메서드 사용 가능

- throw 예외던지기란?
	- 프로그래머가 고의로 예외를 발생시킬 때 사용
	- 예외가 발생했을 경우 현재 메서드가 예외를 처리하지 않고 자신을 호출 한 쪽으로 예외 처리에 대한 책임을 넘기는 것
		~~~
		void method() throws Exception{
			필드
		}
		~~~ 
	- 예외 던지기 시, 메서드 선언 부에 throws 키워드를 붙여, 메서드 호출 하는 부분에서 처리하도록 하는 기법

- ex) Exception 객체 생성 후 매개변수값을 예외메시지로 출력하기

	- ![](https://i.imgur.com/p9yOwXr.png)

- ex) 예외던지기 예시 methodA ~ C까지 예외를 넘기고 C에서 메인으로 예외를 던진다.

	- ![](https://i.imgur.com/8ATu2yz.png)

- ex) 외부, 내부 try-catch 예외 던지기 예시

	- ![](https://i.imgur.com/twAQpnF.png)

- ex) 직접 예외처리 클래스만들어서 예외던지기

	- ![](https://i.imgur.com/8SRcvuG.png)
