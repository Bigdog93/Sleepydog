package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 6, 12, 1, 3, 4, 2 };
		int temp;
//		{ // 버블 정렬
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = 0; j < (arr.length - 1) - i; j++) {
//					if (arr[j] > arr[j + 1]) {
//						temp = arr[j];
//						arr[j] = arr[j + 1];
//						arr[j + 1] = temp;
//					}
//				}
//				System.out.println(Arrays.toString(arr));
//			}
//		}

		{ // 선택 정렬
			for (int i = 0; i < arr.length - 1; i++) {
				int minValIndex = i;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[minValIndex] > arr[j]) {
						minValIndex = j;
					}
				}
				temp = arr[i];
				arr[i] = arr[minValIndex];
				arr[minValIndex] = temp;
				System.out.println(Arrays.toString(arr));
			}
		}

		System.out.println(Arrays.toString(arr));

	}
}
