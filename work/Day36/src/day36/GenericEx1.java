package day36;

public class GenericEx1 {
	public static void main(String[] args) {
		
		Value value = new Value();
		
		value.<Integer>typeSearch(3);
		value.typeSearch(3.14); // jdk 버전이 업 되면서 제네릭 타입을 지정하지 않고 값을 넣어도 형변환이 이뤄짐
		value.typeSearch(3.14f);
		value.typeSearch('a');
		value.typeSearch("hello");
		value.typeSearch(true);
	}
}

class Value {
	public <T> void typeSearch(T x) {
		if (x instanceof Integer) {
			System.out.println(x + "는 정수");
		} else if (x instanceof Double || x instanceof Float) {
			System.out.println(x + "는 실수");
		} else if (x instanceof Character) {
			System.out.println(x + "는 문자형");
		} else if (x instanceof String) {
			System.out.println(x + "는 문자열");
		} else if (x instanceof Boolean){
			System.out.println(x + "는 논리형");
		}
	}
}