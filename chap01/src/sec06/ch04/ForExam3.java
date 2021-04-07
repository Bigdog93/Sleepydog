package sec06.ch04;

public class ForExam3 {
	// for ~ each 문
	// for(배열타입   각 배열안 값 변수   :   배열이름) { }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 41, 5, 6, 7, 8 ,9 ,10};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int val : arr) { System.out.print(val + " "); } // 얘는 인덱스 못썽
		
		
		
		
		
	}
}
