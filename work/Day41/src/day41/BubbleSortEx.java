package day41;

public class BubbleSortEx {
	public static void main(String[] args) {
		
		int arr[] = {6, 4, 7, 9, 0, 1};
		System.out.println("--- 정렬 전 ---");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int temp;
		for(int i = arr.length - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					for(int k = 0; k < arr.length; k++) {
						System.out.print(arr[k] + " ");
					}
					System.out.println();
				}
			}
		}
		
		System.out.println("--- 정렬 후 ---");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
