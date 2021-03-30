package sec06.ch04;

public class ForMission3 {

	public static void main(String[] args) {
		int star = (int)(Math.random() * 6) + 5;
		
		//star는 5 ~ 10 사이 랜덤값 나올 수 있게 할것.
		
		//star 값 만큼 "*" 찍어주기
		
		for(int i = 0; i < star; i++) {
			System.out.print("*");
		}
		System.out.println("\nstar : "+star);
	}

}
