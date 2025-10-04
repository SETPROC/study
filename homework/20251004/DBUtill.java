package ch1;

import java.sql.Connection;
import java.sql.DriverManager;

//오라클 db 연결
public class DBUtill {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "c##tokyo"; //계정
	private static final String PW = "1234"; //비밀번호
	
	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection(URL, USER, PW);
		}catch(Exception e) {
			System.out.println("DB 연결 실패: "+ e.getMessage());
		}
		
		return null;
	}
}
