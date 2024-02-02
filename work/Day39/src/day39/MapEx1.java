package day39;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx1 {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		// 1.put(key, value)
		map.put("apple", "사과");
		map.put("paper", "종이");
		map.put("flower", "꽃");
		
		String voca;
		System.out.println("알고 싶은 단어 입력 : ");
		voca = sc.nextLine();
		
		// 2.containsKey(key) : Key가 hashmap에 존재하면 true 없으면 false
		if(map.containsKey(voca)) {
			// 3.get(key) : value값 반환
			System.out.println("해당하는 뜻은 : " + map.get(voca));
		} else {
			System.out.println("해당 단어가 존재하지 않음");
		}
		
	}
}
