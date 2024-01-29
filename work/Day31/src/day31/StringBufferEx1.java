package day31;

public class StringBufferEx1 {
	public static void main(String[] args) {
		
		String str = "test";
		StringBuffer br = new StringBuffer("test");
		
		System.out.println(str.replace("t", "T")); // 문자열의 값 자체 변경X 새롭게 대입
		System.out.println(str);
		
		br.replace(1, 3, "ES"); // 문자열 값을 변경
		System.out.println(br);
		
	}
}
