package day28;

public class UnknowClassEx3 {
	public static void main(String[] args) {
		
		Abstract abstract1 = new Abstract() {
			
			@Override
			void f2() {
				System.out.println("Abstract exteds f2()");
				
			}
		};
		abstract1.f2();
	}
}

abstract class Abstract{
	abstract void f2();
}
