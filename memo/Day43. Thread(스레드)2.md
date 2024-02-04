
- 스레드의 우선순위
	- 스레드는 시 분할 방식으로 CPU의 시간을 분배하여 실행하지만, 사용자가 직접 스레드의 우선 순위를 지정해서 특정 스레드에 더 많은 실행시간 부여가능

- 우선순위 지정 메서드
	- void setPrionity(int newPrionity)
		- 우선 순위 지정
	- int getPrionrity()
		- 우선 순위 반환
	- 우선 순위는 1 ~ 10까지 부여 가능
	- 설정하지 않을 경우 기본적으로 5이다.

- 스레드의 라이프사이클
	- 스레드는 현재 상태에 따라 4 가지 상태로 분류할 수 있으며, 상태가 변화하는 주기를 Life Cycle이라고 한다.

- 스레드 상태
 
	- ![](https://i.imgur.com/88TpLBu.png)

- ex) Runnable인터페이스를 구현하는 클래스 생성

	- ![](https://i.imgur.com/BeKkXni.png)

- ex) 우선순위 지정해서 출력하기

	- ![](https://i.imgur.com/Ld10rdw.png)


- sleep() 메서드
	- 스레드를 지정한 시간 동안 block상태로 만든다. 시간은 1000분의 1초까지 지정할 수 있으며, 지정된 시간이 지나면 다시 runnable(실행 가능한) 상태로 돌아간다.

- ex) sleep() 메서드 예시(실행하면 1초단위로 스레드가 실행된다.)

	- ![](https://i.imgur.com/eCEm0zd.png)


- yield() 메서드
	- 자신의 시간을 양보하는 메서드, 스레드가 작업을 수행하던 중 yield()를 만나면, 자신에게 할당된 시간을 다음 차례 스레드에게 양도

- ex) yield() 메서드 예시

	- ![](https://i.imgur.com/uSYcUds.png)

	- 출력(★이 먼저 나와야 하나 yield() 메서드를 사용하여 ☆이 먼저 출력하게 가능)

	- ![](https://i.imgur.com/Db3Bbym.png)


- join() 메서드
	- 특정한 스레드가 작업을 먼저 수행할 때 사용 실행 순서를 지켜야 하는 스레드들을 제어한다.

- join() 메서드 예시

	- ![](https://i.imgur.com/kgG9xDd.png)

	- 출력하기

	- ![](https://i.imgur.com/MQYlCRp.png)
