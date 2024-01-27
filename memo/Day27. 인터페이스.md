
- 인터페이스란?
	- inter(사이의) + face(마주하다)의 뜻을 가짐
	- 물체들 사이에서 상호작용 할 수 있도록 하는 매개 역할
	- 클래스가 설계도면 인터페이스는 규격 같은 것

- 인터페이스 주의할 점
	- 상수만 들어갈 수 있다.(final 키워드 생략 가능)
		- final 자료형 변수명 = 값;
	- 추상 메서드만 들어갈 수 있다.
		- abstract 리턴타입 메서드명(abstract 키워드 생략 가능);
	- 인터페이스 내 일반 메서드 사용은 불가
	- 인터페이스 자체를 객체로 생성 불가(클래스에서 구현 후 사용가능)
	- 인터페이스를 구현하는 클래스는 인터페이스에서 선언한 메서드를 가져와서 재정의 해야하기 때문에 오버라이딩 해야한다.

- 구조
	~~~
	interface 인터페이스명{
		필드
	};
	~~~

- 클래스로 인터페이스를 구현할려면
	~~~
	선언부
	interface 인터페이스명{
		필드
	}

	구현부
	class 클래스명 implements 인터페이스명{
		추상 메서드 구현
	}
	~~~ 
	- implements 
		- 클래스에서 인터페이스를 구현하기 위한 클래스

- ex) 인터페이스 생성 후 인터페이스를 구현하는 클래스 만들기
 
	- ![](https://i.imgur.com/o5LQWdo.png)

- ex) 인터페이스를 구현한 클래스를 객체화 한 후 출력하기

	- ![](https://i.imgur.com/tSw0PQo.png)

- ex) 여행 interface 만들어서 재정의하기

	- ![](https://i.imgur.com/oa7Z8EH.png)

- ex) 재정의한 클래스를 업 캐스팅하기

	- ![](https://i.imgur.com/coyuQQu.png)

- ex) 출력하기

	-  ![](https://i.imgur.com/NHI4cKK.png)

- ex) 나라만 바꿔서 다르게 출력하기 interface를 구현하는 JapanTour 클래스 생성

	- ![](https://i.imgur.com/IqqJy7N.png)

- ex) JapanTour로 업 캐스팅

	- ![](https://i.imgur.com/pNQIspa.png)

- ex) 출력하기

	- ![](https://i.imgur.com/O8Hx9fq.png)

- 인터페이스를 사용하여 업캐스팅 하는 이유
	- TourGuide와 KoreaTour 클래스 간 관계가 느슨해 지므로 코드의 수정이 간편함