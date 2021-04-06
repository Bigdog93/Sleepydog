package sec06.ch05;

public class MethodMission {
	public static void main(String[] args) {
		whoIsBig(10, 30, 100); // 콘솔에 100이 가장 큽니다.
		
		whoIsBig(10, 9); // 콘솔에 10이 가장 큽니다.
		
		whoIsBig(11, 25, 1, 24, 3, -1, 3); // 콘솔에 25이 가장 큽니다.
		
		int big = getBigNum(10, 20, 30);
		System.out.println("big : " + big); // big : 30
		
		big = getBigNum(10, 9, 5, 2, 1, -9);
		System.out.println("big : " + big); // big = 10
		
	}
	
	private static void whoIsBig(int...arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		System.out.println("가장 큰 수 : " + max);
	}
	
	private static int getBigNum(int...arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}
}
