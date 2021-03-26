package sec06.ch04;

public class IfMission2 {
	// 남자 평균 키 : 175
	// 여자 평균 키 : 163
	
	public static void main(String[] args) {
		String gender = "남";
		int height = 170;
		final int fe_height_avg = 163;
		final int ma_height_avg = 175;
		
		
		if(gender.equals("남")) {
			if(height > ma_height_avg) {
				System.out.println("키가 평균보다 크시네요 ㅎ");
			}else if(height == ma_height_avg) {
				System.out.println("키가 딱 평균이시네요!!");
				}else {
				System.out.println("키작남");
			}
		}else if(gender.equals("여")) {
			if(height > fe_height_avg) {
				System.out.println("키가 평균보다 크시네요 ㅎ");
			}else if(height == fe_height_avg) {
				System.out.println("키가 딱 평균이시네요!!");
			}else {
				System.out.println("키작녀");
			}
		}else {
			System.out.println("측정불가");
		}
	}

}
