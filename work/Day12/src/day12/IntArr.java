package day12;

public class IntArr {
	public static void main(String[] args) {
		
		int intArr [] = new int [3]; // 배열의 선언과 생성 동시에 초기
		float floatArr [] = new float [3];
		double doubleArr [] = new double [3];
		char charArr [] = new char [3];
		String strArr [] = new String [3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println(intArr[i] + " ");
		}
		System.out.println("------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(floatArr[i] + " ");
		}
		System.out.println("------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(doubleArr[i] + " ");
		}
		System.out.println("------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(charArr[i] + " ");
		}
		System.out.println("------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(strArr[i] + " ");
		}
		System.out.println("------------------");
		
	}
}
