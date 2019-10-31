package com.hello.array;

public class BubbleSort {

	public static void main(String[] args) {
		// ц╟ещеепР
		int[] arr = { 34, 53, 12, 32, 56, 17 };
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int k : arr) {
			System.out.print(k+" ");
		}

	}

}
