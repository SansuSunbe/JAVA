package day38;

import java.util.Stack;

public class StackEx1 {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		// 1.push() : 데이터 삽입
		stack.push("apple");
		stack.push("banana");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack); // top에는 cherry가 들어가 있음
		
		// 2.pop() : top의 데이터 삭제
		System.out.println("pop : " + stack.pop());
		
		// 3.peek() : top의 데이터 보기
		System.out.println("peek : " + stack.peek()); 
		
		// 4.search() : 인덱스가 없기 때문에 1 부터 시작
		System.out.println("orange 위치 : " + stack.search("orange")); // top에 위치한 데이터의 위치는 1부터 오름차순으로 증가한다.
		System.out.println("apple 위치 : " + stack.search("apple"));
		System.out.println("banana 위치 " + stack.search("banana"));
		System.out.println("cherry 위치 : " + stack.search("cherry")); // 없거나 삭제된 데이터는 -1로 뜬다.
		
	}
}
