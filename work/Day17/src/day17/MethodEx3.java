package day17;

public class MethodEx3 {
	public static void main(String[] args) {
		
		System.out.println("사각형의 넓이 : " + calc(10, 20));

	}

	static int calc(int a, int b) {
		System.out.println("계산 시작");
		int area = a * b;
		return area;
	}
}
