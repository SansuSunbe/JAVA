package day04;

public class Operator_ch3 {
	public static void main(String[] args) {
		
		int a =1; // a라는 변수에 1 값 저장
		System.out.println(a);
		
		a++; // a값 1증가 : 후행증가
		System.out.println(a); // 이 때 출력되는 a는 2
		System.out.println(++a); // a의 값 선행증가 이 때 3이 출력
		System.out.println(a++); // a의 값 후행증가 이 다음에 사용할 때 증가
		System.out.println(a); // 이 때 후행증가가 이루어짐

	}
}
