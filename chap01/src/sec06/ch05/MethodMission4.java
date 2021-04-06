package sec06.ch05;

public class MethodMission4 {
	public static void main(String[] args) {
	int rNum = getRandomNum(); // 0 ~ 9
	System.out.println("rNum : " + rNum);
	System.out.println("rNum : " + getRandomNum());
	System.out.println("rNum : " + getRandomNum());
	System.out.println("rNum : " + getRandomNum(2));
	System.out.println("rNum : " + getRandomNum(20));
	System.out.println("rNum : " + getRandomNum(200));
	System.out.println("rNum : " + getRandomNum(10, 20));
	
	}
	private static int getRandomNum(int min, int max) {
		return (int)(Math.random() * (max - min + 1) + min);
	}
	private static int getRandomNum(int max) {
		return (int)(Math.random() * (max));
	}
	private static int getRandomNum() {
		return (int)(Math.random() * 10);
	}
}
