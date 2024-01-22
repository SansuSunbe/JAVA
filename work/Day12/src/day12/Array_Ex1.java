package day12;

public class Array_Ex1 {
	public static void main(String[] args) {
		
		// 3명의 학생 점수 저장 100, 80, 70
		int score [] = new int [3];
		score [0] = 100;
		score [1] = 80;
		score [2] = 70;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "번째 학생의 점수 : " + score[i] + "점");
		}
		
		
		
	}
}
