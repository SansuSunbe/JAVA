package day37;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		
		System.out.print("초기 상태 : ");
		System.out.println(list1);
		
		System.out.println("인덱스 1위치에 B추가");
		System.out.println("인덱스 2위치에 b추가");
		
		list1.add(1, "B");
		list1.add(2, "b");
		
		System.out.println(list1);
		
		System.out.print("인덱스 1위치의 값 삭제 : ");
		
		list1.remove(1);
		
		System.out.println(list1);
		
		System.out.println("인덱스 3위치의 값 반환 : " + list1.get(3));
		
	}
}
