package day25;

public class DownCastingEx1 {
	public static void main(String[] args) {
		
		// 업캐스팅
		Human human1 = new Student("김길동", 20, "코딩", 3);
		// human1.study();
		
		// 다운캐스팅
		Student student1 = (Student)human1;
		student1.study();
		
	}
}
