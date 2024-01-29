package day31;

public class StringEx1 {
	public static void main(String[] args) {

		String str = "hello";
		// str 자체의 값이 바뀐건 아님
//		System.out.println(str + " world");
		System.out.println(str.concat(" world"));
		System.out.println(str);

		// substring(시작위치, 끝위치) : 시작위치 ~ 끝 위치까지의 값을 가져옴
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(3)); // 지정한 범위부터 끝까지 가져온다.
		
		// length() : 띄어쓰기 까지 포함해서 문자열의 길이를 가져온다.
		System.out.println(str.length());
		
		// toUpperCase, toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println("TesT".toLowerCase());
		
		// charAt(인덱스), indexOf(문자열), equals(문자열)
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf("A")); // 문자열을 못찾으면 -1로 나온다.
		System.out.println(str.indexOf("o"));
		System.out.println(str.equals("hello"));
		System.out.println(str.equals("HELLO"));
		
		// trim(), replace, replaceAll
		System.out.println(" test ".trim());
		System.out.println("hello world".replace("h", "H")); // h -> H로 변경
		System.out.println("hello world".replaceAll("hello", "bye"));
	}
}
