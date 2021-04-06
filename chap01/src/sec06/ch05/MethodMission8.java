package sec06.ch05;

public class MethodMission8 {
	public static void main(String[] args) {
		gugudan(8);
		
		
		gugudan(4, 8); // 단 바뀔때 --------, 개행 구분자 사용
	}
	
	private static void gugudan(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	private static void gugudan(int ini, int dan) {
		for(int i = ini; i <= dan; i++) {
			gugudan(i);
			System.out.println("--------------------");
		}
	}
}
