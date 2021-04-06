package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	// 남 평 : 174, 여 평 : 163
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer = null;
		do {
			System.out.print("성별 : ");
			String gender = sc.next(); // 남, 여
			
			System.out.print("키 : ");
			int height = sc.nextInt();
			
			String result = chk(gender, height);
			System.out.println(result);
			//성별 : 남, 키 : 170cm, 평균 미만
			
			System.out.print("계속 하시겠습니까? (y, n)");
			answer = sc.next();
		} while(answer.equals("y"));
		
		sc.close();
	}
	
	private static String getAvg(int avg, int height) {
		if(height > avg) return "초과";
		else if(height < avg) return "미만";
		return "";
	}
	
	private static String chk(String gender, int height) {
		final int M_AVG = 174;
		final int F_AVG = 163;
		if(!gender.equals("남") && !gender.equals("여")) return "잘 못 입력하셨습니다.";
//		String res = null;
//		if(gender.equals("남")) {
//			res = getAvg(M_AVG, height);
//		}
//		else if(gender.equals("여")) {
//			res = getAvg(F_AVG, height);
//		}else {
//			return "잘 못 입력하셨습니다.";
//		}
//		return "성별 : " + gender + ", 키 : " + height + "cm, 평균 " + getAvg(gender.equals("남") ? M_AVG : F_AVG, height);
		return String.format("성별 : %s, 키 : %dcm, 평균 %s", gender, height, getAvg(gender.equals("남")?M_AVG : F_AVG, height));
		// String.foramt() : return값이 문자열, 실무에서 훨씬 많이 쓰는 방법
	}
}
