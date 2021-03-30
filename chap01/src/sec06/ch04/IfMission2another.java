package sec06.ch04;

public class IfMission2another {

	public static void main(String[] args) {
//		String gender = "남";
//		int height = 170;
//		final int FEMALE_AVG = 163;
//		final int MALE_AVG = 175;
//		
//		if(gender.equals("남")) {
//			if(height > MALE_AVG) {
//				System.out.println("키가 평균보다 크시네요 ㅎ");
//			}else if(height == MALE_AVG) {
//				System.out.println("키가 딱 평균이시네요!!");
//				}else {
//				System.out.println("키작남");
//			}
//		}else if(gender.equals("여")) {
//			if(height > FEMALE_AVG) {
//				System.out.println("키가 평균보다 크시네요 ㅎ");
//			}else if(height == FEMALE_AVG) {
//				System.out.println("키가 딱 평균이시네요!!");
//			}else {
//				System.out.println("키작녀");
//			}
//		}else {
//			System.out.println("측정불가");
//		}
		
		String gender = "남";
		int height = 170;
		final int FEMALE_AVG = 163;
		final int MALE_AVG = 175;
		
		int stand = 0;		
		
		String displayResult, displayGender;
		
		if(gender.equals("남")) {
			stand = MALE_AVG;
			displayGender = "남자";
		} else if(gender.equals("여")) {
			stand = FEMALE_AVG;
			displayGender = "여자";
		} else {
			displayGender = "외계인";
		}

		if(height > stand) {
			displayResult = "평균 이상";
		}else if(height == stand) {
			displayResult = "평균";
		}else {
			displayResult = "평균 미만";
		}
		
		System.out.printf("%s 평균 키는 %d이며, 고객님의 키는 %d이므로, %s입니다.", displayGender, stand, height, displayResult);
	}

}