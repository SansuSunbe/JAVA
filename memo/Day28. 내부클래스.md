
- 내부클래스란?
	- 클래스 내부에서 생성된 클래스
	- 클래스이기 때문에 선언부에 접근제한자를 사용할 수 있다.

- 내부 클래스의 객체를 생성하는 방법
	~~~
	외부클래스.내부클래스 객체명 = new 외부클래스생성자();
	~~~

- 구조
	~~~
	class OuterClass{
		필드

		class InnerClass{
			필드
		}
	} 
	~~~

- 종류
	- 인스턴스 클래스
		- 외부 클래스에서 멤버 변수 위치에 선언
		- 클래스의 내부에서 인스턴스(객체)멤버처럼 다뤄지며, 인스턴스 멤버들과 상호작용이 가능하다.
			~~~
			class OuterClass{
				필드

				class InnerClass{
					필드
				}
			}
			~~~ 
	- 스태틱 클래스
		- 외부 클래스에서 멤버 변수 위치에 선언
		- 클래스 내부에서 static 멤버처럼 다뤄지며 static멤버들과 상호작용이 가능
			~~~
			class OuterClass{
				필드

				static class InnerClass{
					필드
				}
			}
			~~~ 
	- 지역 클래스 
		- 메서드 내부 지역변수 위치에 선언
		- 메서드나 초기화 블록의 내부에서 다뤄지며 선언된 영역 내부에서 사용 가능
			~~~
			class OuterClass{
				void A(){
					class InnerClass{
						필드
					}
				}
				
			}
			~~~ 
	- 익명 클래스
		- 이름이 없는 클래스를 의미
		- 기존 클래스를 오버라이딩해서 만든다.
		- 주로 인터페이스 혹은 추상클래스를 일회성으로 구현할 때 많이 사용한다.
			~~~
			기존 클래스
			class Ex{
				private int a = 3;
				int getter(){
					return this.a;
				}

				void setter(int a){
					this.a = a;
				}
			}
			~~~ 

			~~~
			익명클래스
			class Ex Unknow = new Ex(){
				private int a = 3;
				int getter(){
					return this.a;
				}

				void setter(int a){
					this.a = a;
				}
			}
			~~~

- ex) 내부 클래스 예시

	- ![](https://i.imgur.com/fqAoH5V.png)

- ex) static 클래스 예시

	- ![](https://i.imgur.com/3VhP9hg.png)

- ex) static 클래스 출력

	- ![](https://i.imgur.com/9VSEsG9.png)

- ex) 인터페이스를 활용한 익명클래스 구현

	- ![](https://i.imgur.com/9QVIFeW.png)

- ex) 추상클래스를 활용한 익명클래스 구현

	- ![](https://i.imgur.com/geutrMY.png)
