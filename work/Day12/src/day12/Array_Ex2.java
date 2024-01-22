package day12;

import java.util.Arrays;

public class Array_Ex2 {
	public static void main(String[] args) {
		
		// a라는 정수형 배열에 생성과 동시에 초기값을 넣기
		int [] a = new int [] {10, 20, 30, 40, 50};
		
		// b라는 정수형 배열에 생성과 동시에 초기값을 넣기
		int [] b = {1, 2, 3, 4, 5}; // a와 다르게 new int [] 생략 가
		
		// c라는 정수형 배열을 선언과 동시에 크기 할당
		int c [] = new int [10];
		
		// 배열명.length : 배열의 길이, 배열의 요소 갯수를 출
		for(int i = 0; i < c.length; i++) {
			c[i] = i;
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("--------------------------");
		// Arrays.toString(배열명) : 배열의 요소를 문자열로 출력
		System.out.println(Arrays.toString(c));
		
	}
}
