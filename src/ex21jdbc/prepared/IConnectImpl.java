package ex21jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class IConnectImpl implements IConnect {
	public Connection con;
	//동적쿼리 처리를 위한 객체.
	public PreparedStatement psmt;
	public ResultSet rs;
	
	public IConnectImpl() {
		System.out.println("IConnectImpl 기본생성자 호출");
	}
	public IConnectImpl(String user, String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(ORACLE_DRIVER);
			connect(user,pass);
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	public IConnectImpl(String driver, String user, String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(driver);
			connect(user,pass);
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	//오라클 DB에 연결
	@Override
	public void connect(String user, String pass) {
		try {
			con = DriverManager.getConnection(ORACLE_URL,user,pass);
		}
		catch(SQLException e) {
			//커넥션URL이나 계정명이 잘못되었을때 발생
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
	}
	/*
	오버라이딩의 목적으로 정의한 메소드. 쿼리실행은 각각의 클래스에 진행하게 되었음.
	*/
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	// 자원해제
	@Override
	public void close() {
		// TODO Auto-generated method stub
		try { 
			if(psmt!=null) psmt.close();
			if(con!=null) con.close();
			if(rs!=null) rs.close();
			System.out.println("DB자원반납완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	@Override
	public String scanValue(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.print(title+"을(를) 입력(exit->종료):");
		String inputStr = scan.nextLine();
		/*
		 equalsIgnorCAse()
		 : equal() 메ㅗ드와 동일하게 문자열이 같은지 비교하는 메소드로
		 다른 점은 대소문자를 구하지 안흔다
		 */
		if("EXIT".equalsIgnoreCase(inputStr)) {
			System.out.println("프로그램을 종료합니다.");
			close();
			System.exit(0);
		}
		return inputStr;
		
	}
}
