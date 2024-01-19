- println
	-> 출력값을 출력 후 줄바꿈

- print
	-> 출력값을 줄바꿈하지 않고 출력

- printf
	-> 형식지정출력메서드
	-> printf에서 "f" 는 format의 약자
	-> %s : 문자열 포멧
	-> %c : 문자형 포멧 -> 아스키코드값 출력 가능
	-> %d : 정수값 포멧
	-> %f : 실수값 포멧 
	ex) System.out.printf("형식지정자", 출력값);

- Scanner란?
	-> 사용자로부터 값을 입력받기 위한 클래스
	-> 클래스이기 때문에 사용을 객체화하여 사용해야함
		-> Scanner 객체명 new Scanner(System.in);

- Scanner 입력메서드의 종류 
	1)  .next();
		-> 문자열로 입력받는다.
	2)  .nextInt();
		-> 정수값으로 입력받는다.
	3)  .nextFloat();
		-> 실수값으로 입력받는다.
	4)  .nextLine();
		 -> 문자열로 띄어쓰기까지 입력받는다.
		 -> next() 는 띄어쓰기는 출력을 안해준다.
