
- break문
	- 반복문 내에서 어떤 조건을 주어 반복을 멈추고 싶을 때 
	~~~
	반복문{
		if(반복을 멈출 조건){
			break;
		}
	} 
	~~~

- 무한반복
	- 반복이 멈추지 않고 계속해서 실행되는 것
		-> 조건이 항상 참일 떄 실행됨
		~~~
		while(true){
			반복할 명령;
		}
		~~~
	- ex1) 콘솔창에 빨긴 네모 버튼을 누를 때까지 반복
		- ![](https://i.imgur.com/csP1sWu.png)

- ex1 0을 입력시 프로그램 종료)
	- ![](https://i.imgur.com/TtcIX4w.jpg)

- ex2 짝수 입력시 프로그램 종료)
	- ![](https://i.imgur.com/H159cyu.jpg)

- ex3 입력한 모든 숫자를 더하고 0을 누르면 종료)
	- ![](https://i.imgur.com/3PgwfXz.jpg)


## contiunue문

- continue문
	- 아래 명령을 무시하고 다음 반복 실행
	~~~
	반복문{
		if(다음 반복을 실행할 조건){
			continue;
		}
	}
	~~~

- ex1 0보다 작은 숫자 입력시 continue, 0 입력시 종료)
	- ![](https://i.imgur.com/CWXvy8c.jpg)

- ex2 남은 잔액 계산)
	- ![](https://i.imgur.com/Gc7sFOc.jpg)

