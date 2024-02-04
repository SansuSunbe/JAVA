
- 스레드의 동기화란?
	- 멀티 스레드로 작업 시, 스레드 간 작업이 서로 간섭이 되지 않도록 하는 것

- 멀티스레드의 문제점
	- 멀티 스레드 기법은 자원을 공유하는데, 이 때 동시에 같은 자원을 처리한다면, 자원 값이 실제 처리 해야하는 작업보다 더 많은 작업이 발생할 수 있다. 

- ex) 멀티스레드 예시

	- ![](https://i.imgur.com/rZ5ttS0.png)

	- ![](https://i.imgur.com/U6Hodyi.png)

- ex) 멀티 스레드 예시 2

	- ![](https://i.imgur.com/z3phqOe.png)

	- ![](https://i.imgur.com/lssrtTP.png)

- Thread Synchronized(스레드의 동기화)
	- 동시에 작업하는 메서드에 synchronized 키워드 사용
	- 여러 스레드가 공유된 자원에 동시에 접근할 때 발생하는 경쟁 상태를 방지하는데 사용 되는 키워드
	- 객체에 대한 락(Lock)을 사용하여 동기화를 구현 락을 얻을 수 없는 스레드는 블록이 실행될 때 까지 블록킹된다.
		~~~
		public synchronized void 메서드명(){
			필드
		}
		~~~ 
	- synchronized 영역 지정하기
		~~~
		void 메서드명(){
			synchronized(스레드 객체){
				필드
			}
		}
		~~~ 

- ex) synchronized 예시(메서드 형식)

	- ![](https://i.imgur.com/dmZG6Pw.png)

	- ![](https://i.imgur.com/4hjMQUq.png)

- ex) synchronized 예시(영역 지정)

	- ![](https://i.imgur.com/YTTOpLG.png)

	- ![](https://i.imgur.com/Ka6bP7k.png)

- wait(), notify() 메서드

	- ![](https://i.imgur.com/ARPmVJc.png)

- ex) 예시 코드
	