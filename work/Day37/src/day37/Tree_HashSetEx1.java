package day37;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree_HashSetEx1 {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		
		TreeSet ts = new TreeSet();
		
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");
		
		Iterator it = hs.iterator(); // HashSet의 모든 요소에 접근 가능
		System.out.println("<HashSet> 출력");
		while(it.hasNext()) { // it이라는 객체로 HashSet의 더 이상 가져올 요소가 없을 때까지 반복
			System.out.print(" " + it.next());
		}
		
		System.out.println();
		
		Iterator it2 = ts.iterator();
		System.out.println("<Tree Set> 출력");
		while(it2.hasNext()) {
			System.out.print(" " + it2.next());
		}
		System.out.println(); // 줄바꿈
		
		System.out.println("현재 TreeSet의 크기 : " + ts.size());
		
	}
}
