
- API(Application Programming Interface)
	- 자바에서 개발자들을 위해 기본적으로 제공하는 클래스

- Object 클래스란?
	- 모든 클래스의 조상 클래스
	- 모든 클래스는 Object 클래스의 필드를 상속받는다.

- 문자열 클래스
	- 문자열에 대한 다양한 처리를 위한 다양한 메서드가 정의된 클래스
	- 종류
		- String 클래스
		- StringBuffer 클래스
		- StringTokenizer 클래스

- String 클래스
	- 객체 생성 시, 보통 클래스와는 다르게 기본 자료형 선언처럼 사용한다.

- String 클래스 주요 메서드
	- concat(문자열) 
		- 문자열을 연결
	- substring(시작위치, 끝위치)
		- 지정한 인덱스 범위만큼 문자열을 가져온다.
	- length()
		- 문자열의 길이 반환
	- toUpperCase()
		- 문자열을 대문자로 변환
	- toLowerCase()
		- 문자열을 소문자로 변환
	- charAt(인덱스)
		- 인덱스에 해당하는 글자 반환
	- indexOf(문자열)
		- 문자열의 위치 반환
	- equals(문자열)
		- 문자열이 같은지 boolean 값 반환
	- trim()
		- 문자열 앞, 뒤 공백 제거
	- replace(기존문자열, 대체문자열)
		- 기존문자열을 대체 문자열로 변경
	- replaceAll(변환할 문자열, 변환된 문자열)
		- 문자열 내의 특정부분을 다른 문자열로 변경

- ex) concat() 메서드 예시

	- ![](https://i.imgur.com/fD8Erxe.png)

	- concat() 메서드 사용하는거랑 단순 연산해서 출력하는거 차이
	- ![](https://i.imgur.com/zdjeinC.png)

- ex) substring() 메서드 예시

	- ![](https://i.imgur.com/4O6Gohd.png)

- ex) length() 메서드 예시

	- ![](https://i.imgur.com/bkYUzQb.png)

- ex) toUpperCase(), toLowerCase() 메서드 예시

	- ![](https://i.imgur.com/YPm5QOo.png)

- ex) charAt(), indexOf(), equals() 메서드 예시

	- ![](https://i.imgur.com/5w6tvL7.png)

- ex) trim(), replace, replaceAll 메서드 예시

	- ![](https://i.imgur.com/0Q7aMZy.png)

- StringBuffer 클래스
	- String 클래스는 immutable(변하지 않는) 객체이기 때문에, 자주 사용할 수록 인스턴스를 만들기 때문에 느려진다는 단점이 있다.
	- 위의 단점을 보완하기 위한 클래스가 StringBuilder, StringBuffer 클래스이다.
	- 이 클래스들은 객체 안의 데이터를 내부적으로 변경할 수 있으므로, 새로운 객체를 만들지 않는 mutable(변할 수 있는) 객체를 만든다.

- StringBuffer 클래스 주요 메서드
	- append()
		- 매개변수로 입력된 값을 문자열로 바꾸어서 더해주는 메서드
	- reverse()
		- 문자열의 순서를 반대로 나열하는 메서드
	- insert(int pos, Object obj)
		- 두 번째 매개변수의 값을 문자열로 바꾸어서 pos위치에 추가하는 메서드
	- delete(int start, int end)
		- 지정한 인덱스 범위부터 end 인덱스 직전 위치의 문자열을 제거하는 메서드
	- deleteCharAt(int index)
		- index위치에 있는 문자를 제거하는 메서드

- ex) StringBuffer클래스 replace 예시

	- ![](https://i.imgur.com/U9mHR4v.png)

- StringTokenizer 클래스
	- java.util 패키지에 있는 클래스로, 문자열을 구분문자열을 기준으로 분리할 때 사용한다. 
	1. 문자열 생성
	2. 구분할 문자열 생성
	3. StringTokenzier 객체 생성
	~~~
	StringTokenizer 객체명 = new StringTokenizer(문자열, 구분문자열);
	~~~ 

- StringTokenizer 주요 메서드
	- nextToken()
		- 다음 토큰으로 이동
	- hasMoreTokens()
		- 다음 토큰이 존재하면 true, 존재하지 않으면 false
	- countTokens()
		- 남은 토큰의 갯수