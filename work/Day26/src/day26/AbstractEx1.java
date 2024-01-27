package day26;

public class AbstractEx1 {
	public static void main(String[] args) {
		
		Shape shapes [] = new Shape[3];
		
		// 부모 객체배열 요소에 자식 값 넣기 -> 업 캐스팅
		shapes[0] = new Rect();
		shapes[1] = new Circle();
		shapes[2] = new Line();
		
		for(int i = 0; i < 3; i++) {
			shapes[i].draw();
		}
		
	}
}

abstract class Shape{
	abstract void draw();
}

class Rect extends Shape{
	void draw() {
		System.out.println("사각형");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("원");
	}
}

class Line extends Shape{
	void draw() {
		System.out.println("선");
	}
}


