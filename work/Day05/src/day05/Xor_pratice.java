package day05;

public class Xor_pratice {
	public static void main(String[] args) {
		
		int a = 15; // 1111(2)
		int b = 5; // 0101(2)
		
		System.out.println(a & b); // 0101(2) = 5
		System.out.println(a | b); // 1111(2) = 15
		System.out.println(a ^ b); // 1010(2) = 10
		System.out.println(~b); // 1010(2) = 10? -> -6
		
		// 쉬프트 연산자
		System.out.println(a >> 2);
		System.out.println(b << 4);
		
	}
}
