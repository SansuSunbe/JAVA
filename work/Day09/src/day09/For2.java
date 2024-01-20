package day09;

public class For2 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.printf("i = %d, sum = %d \n", i , sum += i);
		}
		
		// 1 ~ 10까지의 합을 계산해서 출력
		int sum2 = 0;
//		 for문을 사용안할시 
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
		
		for(int i = 1; i <= 10; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum);
		
		
		
	}
}
