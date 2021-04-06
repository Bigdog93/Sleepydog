package sec06.ch05;

public class MethodMission2 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		double result = divide(n1, n2);
		System.out.println("result : " + result);
		
		n2 = 2;
		result = divide(n1, 5, n2);
		System.out.println("result : " + result);
		
		System.out.println("절대값(10) : " + abs(10));
		System.out.println("절대값(-10) : " + abs(-10));
	}
	
	private static double divide(int...arr) {
		double result = arr[0];
		for(int i = 1; i < arr.length; i++) {
			result /= arr[i];
		}
		
		return result;
	}
	
	private static double divide(int a, int b) {
		return (double)a/b; // 둘 중 하나만 형변환 해도 해준다.
	}
	
	private static int abs(int a) {
		if(a >= 0) return a;
		else return -a;
	}
}
