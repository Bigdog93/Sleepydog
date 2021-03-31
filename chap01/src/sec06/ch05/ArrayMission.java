package sec06.ch05;

public class ArrayMission {
	public static void main(String[] args) {
		// 정수형 배열 생성(10칸 짜리)
		// 모든 방에 정수값 20 셋팅
		
		int[] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = 20;
		}
		for(int i = 0; i < intArr.length; i++) {
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
		
		// 배열에서 값 넣는것과 출력하는거는 따로 쓰는 습관 들일 것.
	}
}
