package day35;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // System.in : InputStream의 객체
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.println(name = "입장");
		
		sc.close();
		
	}
}
