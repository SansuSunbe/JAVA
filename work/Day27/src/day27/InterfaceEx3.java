package day27;

public class InterfaceEx3 {
	public static void main(String[] args) {
		
		MyCellPhone phone1 = new MyCellPhone();
		Camera phone2 = new MyCellPhone();
		Call phone3 = new MyCellPhone();
		Memo phone4 = new MyCellPhone();
		Clock phone5 = new MyCellPhone();
		User user1 = new User();
		
		user1.call(phone1);
//		user1.call(phone2); // 인터페이스를 구현한 클래스 없이 바로 객체화 했기 때문에 오류난다.
		user1.call(phone3);
//		user1.call(phone4);
//		user1.call(phone5);
		
	}
}

interface Camera{
	void photo();
}

interface Call{
	void Calling();
}

interface Memo{
	void write();
}

interface Clock{
	void clock();
}

class MyCellPhone implements Camera, Call, Memo, Clock{

	@Override
	public void clock() {
		System.out.println("clock()");
		
	}

	@Override
	public void write() {
		System.out.println("write()");
		
	}

	@Override
	public void Calling() {
		System.out.println("calling()");
		
	}

	@Override
	public void photo() {
		System.out.println("photo");
		
	}
}

class User{
	void call(Call c) {
		System.out.println("통화");
	}
}