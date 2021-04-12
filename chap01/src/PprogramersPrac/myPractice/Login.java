package PprogramersPrac.myPractice;

import java.util.Scanner;

public class Login {
	private static String id;
	private static String pw;
	static Member mb = new Member();
	
	static Scanner sc = new Scanner(System.in);
	
	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		Login.id = id;
	}

	public static String getPw() {
		return pw;
	}

	public static void setPw(String pw) {
		Login.pw = pw;
	}
	
	static int mainUI() {
		System.out.println("1. 로그인		2.회원가입");
		return sc.nextInt();
	}

	static void login() {
		System.out.print("ID : ");
		setId(sc.next());
		System.out.print("PW : ");
		setPw(sc.next());
	}
	static void loginExe() {
		mb.loginScc = mb.ids.contains(id) && mb.pws.contains(pw);
		if(mb.loginScc) {
			System.out.println("로그인 하셨습니다.");
		}else {
			System.out.println("ID 또는 PW 확인해주십시오.");
		}
		
	}
	static void join() {
		if(mb.ids.contains(id)) {
			System.out.println("이미 존재하는 ID입니다.");
		}else {
			mb.ids.add(id);
			mb.pws.add(pw);
			System.out.println("회원가입 하셨습니다.");
		}
		
	}
	
	
	
}
