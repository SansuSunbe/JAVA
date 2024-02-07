
- GUI(Graphical User Interface)
	- 컴퓨터를 사용하는 사용자를 위해 만들어진 특정한 기능을 가진 그래픽 요소

- AWT란?
	- 자바에서 GUL 프로그래밍을 하기 위해 처음으로 제공한 라이브러리
	- java.wat 패키지에 Frame, Window, Panel, Button, Label 등이 존재
	- 운영체제의 자원을 활용(운영체제에 의존적)

- SWING란?
	- AWT를 대체하기 위해 자바로 작성된 GUI객체
	- javax.swing 패키지에 JFrame, JWindow, JPanel, JButton, JLabel등이 존재
	- 운영체제에 의존적이지 않으며, 운영체제와 관계없이 동일한 모양을 사용

- 컴포넌트(Component)
	- JAVA에서 GUI를 구성하는 요소
 
- 컨테이너(Container)
	- 다른 컴포넌트를 포함할 수 있는 컴포넌트

- GUI 프로그래밍을 하기 위해서 사용하는 메서드
	- ![](https://i.imgur.com/ihTKZWT.png)

- GUI 프로그래밍 순서
	1. extends JFrame
		- JFrame 클래스를 상속받아, 프레임 클래스 작성
		- 생성자에서 컴포넌트 및 프레임의 디자인 구현하기
		~~~
		public class 클래스명 extends JFrame
		~~~ 
	2. 기본설정(생성자에서 하기) 
		-  title, size, visible 설정
		- title 설정 
			- setTitle("타이틀명);
		- size 설정
			- setSize(가로길이, 세로길이);
		- visible 설정
			- setVisible(true);

- ex) JFrame 예시
	- 
	- ![](https://i.imgur.com/gSCZmI8.png)


- 배치관리자(Layout Manager)
	- 컨테이너 내부에 컴포넌트 추가 시 각각의 위치와 크기에 관해 결정

- 배치 관리자의 종류
	- ![](https://i.imgur.com/xGt1kV1.png)

- ex) Flow Window 예시
	- 
	- ![](https://i.imgur.com/CJiY7ZA.png)

- ex) Border Window 예시
	- 
	- ![](https://i.imgur.com/9350EXA.png)

- ex) Grid Window 예시
	- 
	- ![](https://i.imgur.com/bcMw0LC.png)
