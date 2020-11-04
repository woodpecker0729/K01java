package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {
	private Connection con;
	private Statement stmt;
	public DeleteQuery() {
		try {
			//1. 오라클 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			//ojdbc6.jar 파일이 없거나 연동되지 않았을 때 발생
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	//Oracle DB에 대한 연결을 진행한다.
	public void connect() {
		try {
		con = DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521:orcl","kosmo","1234");
		}
		catch(SQLException e) {
			//커넥션URL이나 계정명이 잘못되었을때 발생
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
	}
	private void execute() {
		
		connect();
		
		try {
			/*
			 * test99 삭제시 입력되지 않은 데이터이므로 삭제되지 않음.
			 * 데이터가 없는 경우 예외는 발생하지 않음
			 * ko1 삭제시 자식레코드가 있으므로 제약조건 위배로 삭제되지 않음.
			 */
			stmt = con.createStatement();
			String query = "DELETE FROM member WHERE id='ko1'";
			int affected = stmt.executeUpdate(query);
			System.out.println(affected+"행이 삭제되었습니다.");
		}
		catch(SQLException e) {
			//커넥션URL이나 계정명이 잘못되었을때 발생
			System.out.println("쿼리실행 실패");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	private void close() {
		try { 
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
			System.out.println("DB자원반납완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeleteQuery().execute();
	}

}
