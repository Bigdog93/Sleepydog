package PprogramersPrac.myPractice;

public class Main {
	public static void main(String[] args) {

		while (true) {
			switch (Login.mainUI()) {
			case 1:
				Login.login();
				Login.loginExe();
				break;
			case 2:
				Login.login();
				Login.join();
				break;
			default:
				System.out.println("1번, 2번 중 선택해주십시오.");
			}
		}
	}
}
