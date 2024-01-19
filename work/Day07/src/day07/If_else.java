package day07;

public class If_else {
	public static void main(String[] args) {
		
		int age = 15;
		if(age > 19) {
			System.out.println("성인");
			System.out.println("성인요금");
		} else { // age <= 19
			System.out.println("청소년");
			System.out.println("청소년 요금");
		}
		System.out.println("결제");
		
	}
}
