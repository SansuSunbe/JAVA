
- Scanner 클래스
	- 문자 데이터를 읽어오는데 도움을 주는 클래스
	~~~
	Scanner 객체명 = new Scanner(System.in); // 입출력 스트림과의 연결
	변수명.입력메서드();
	~~~ 
	- 예시
	~~~
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt;
	System.out.println(n);
	~~~

- 사용 메서드
	- nextBoolean()
		- 논리값으로 입력
	- nextByte()
		- byte값으로 입력
	- nextDouble()
		- double값으로 입력
	- nextFloat()
		- float값으로 입력
	- nextInt()
		- int값으로 입력
	- nextLine()
		- Enter 키 입력 전까지 문자열로 입력
	- next()
		- 공백전까지 문자열로 입력

- ex) Scanner로 입력받아 출력하기

	- ![](https://i.imgur.com/AByXcTZ.png)

- ex) 텍스트 파일 생성 후 텍스트 파일에 입력한 내용 출력하기	
	- ![](https://i.imgur.com/nkRmZyI.png)

	- sample.txt 파일 생성 후 입력

	- ![](https://i.imgur.com/zj4nirS.png)

	- sample.txt 파일에 내용 입력

	- ![](https://i.imgur.com/kMWoA9k.png)


- BigDecimal 클래스란?
	- 정확한 소수점 연산을 해야할 때 사용
	- double, long 자료형으로 소수점 연산 시 오차가 나는 부분을 보완한다.
	- java.math 패키지내 클래스
	~~~
	BigDeciaml 객체명 = new BigDecimal(String.valueOf(변수명));
	~~~ 

- ex) 그냥 연산 vs BigDecimal 클래스

	- ![](https://i.imgur.com/wDG4usx.png)


- formatting(포멧팅)이란?
	- 데이터의 형식을 지정하는 것을 의미
	- DecimalFormat
		- 숫자를 형식화 하는 클래스
		- ![](https://i.imgur.com/6wOwbiN.png)

- ex) format 예시

	- ![](https://i.imgur.com/iLCboqO.png)
