package day41;

public class SelectionSortEx {
	public static void main(String[] args) {

		int min, temp;
		int arr[] = { 8, 1, 2, 5, 4, 3, 6, 7 };
		System.out.println("--- 정렬 전 ---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(); // 줄 바꿈
		
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
					System.out.println("swap 후");
					for(int k = 0; k < arr.length; k++) {
						System.out.print(arr[k] + " ");
					}
					
					System.out.println(); // 줄 바꿈
					
				}
			}
		}
		
		System.out.println("--- 정렬 후 ---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
