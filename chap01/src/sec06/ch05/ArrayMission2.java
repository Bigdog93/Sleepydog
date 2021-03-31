package sec06.ch05;

public class ArrayMission2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
//		for([배열 자료형][변수명]:[배열명] or [컬렉션 객체명]) 배열 확장 for문
		for(int i:arr) {
			System.out.printf("%d ", i);
		}
	}
}
