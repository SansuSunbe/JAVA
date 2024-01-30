package day35;

import java.io.FileInputStream;
import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("src//day35//sample.txt");// 파일 입출력 클래스
			Scanner sc = new Scanner(file); // file 객체에 입력
			while(sc.hasNext()) { // hasNext() : 다음 값이 존재하는지 판단 즉 다음값이 있을 때까지 반복
				System.out.println(sc.nextLine()); // nextLine() : 한 줄씩 입력받는다. 
			}
		} catch (Exception e) {
			e.printStackTrace(); // 오류내용 출력
		}
		
	}
}
