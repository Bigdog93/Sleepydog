package sec06.ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionExam4 {
	public static void main(String[] args) {
		// 싱글톤 : 프로그램안에서 객체가 1개만 만들어지도록 유도
		// 2개 이상 만들 수 없도록 한다.
		
		DbUtils du = DbUtils.getInstance();
		DbUtils du2 = DbUtils.getInstance();
		
		System.out.println(du == du2);
	}
}

class DbUtils {
	//싱글톤 만들기1
	private DbUtils() {}; // 밖에서 객체화를 막는다.
	private static DbUtils dbutils = new DbUtils();
	
	public static DbUtils getInstance() {
		return dbutils;
	}
	/*// 싱글톤 만들기2
private static DbUtils dbutils;
	
	public static DbUtils getInstance() {
		if(dbutils == null) {
			dbutils = new DbUtils();
		}
		return dbutils;
	}
	*/
	
	Connection getCon() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			final String URL = "jdbc:mysql://localhost:3308/java";
			// 내컴퓨터가 아닌 다른 IP에 접속하려면 localhost자리에 IP주소
			//"jdbc:DBMS명://DB가 있는 IP주소:포트번호/DB명
			final String USERNAME = "root";
			final String PASSWORD = "koreait";
			
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Conneted");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ID, 비밀번호 확인하세요");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버를 찾을 수 없습니다.");
		}
		
		return con;
	}
}
