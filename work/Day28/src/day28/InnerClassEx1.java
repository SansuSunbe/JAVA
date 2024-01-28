package day28;

public class InnerClassEx1 {
	public static void main(String[] args) {
		
		
		
	}
}

class A{
	static class StaticInner{
		class InstanceInner{
			
			StaticInner staticClass1 = new StaticInner();
			InstanceInner instanceInner1 = new InstanceInner();
			
			static void StaticMethod() {
				StaticInner staticClass2 = new StaticInner();
				// static 메서드는 인스턴스 멤버에 접근 불가능하다.
//				InstanceInner instanceInner2 = new InstanceInner();
			}
			
			void IntanceMethod() {
				StaticInner staticClass3 = new StaticInner();
				InstanceInner instanceInner3 = new InstanceInner();
			}
		}
	}
}
