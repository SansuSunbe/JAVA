package day38;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		// 1.add(e) : rear위치에 데이터(e) 삽입
		queue.add("apple");
		queue.add("banana");
		queue.add("cherry");
		queue.add("tomato");
		
		System.out.println(queue);
		
		// 2.E element : front에 위치한 데이터 반환
		System.out.println("element() : " + queue.element());
		
		// 3.remove : front에 위치한 데이터를 반환 후 삭제
		System.out.println("remove() : " + queue.remove());
		System.out.println(queue);
		
		// 4.offer(e) : rear위치에 데이터 삽입
		queue.offer("peach");
		System.out.println(queue);
		
		// 5. peek() : front 위치에 있는 데이터의 값 반환
		System.out.println("peek() : " + queue.peek());
		System.out.println(queue);
		
		// 6. poll() : front에 위치한 데이터를 반환 후 삭제
		System.out.println("poll() : " + queue.poll());
		System.out.println(queue);
		
	}
}
