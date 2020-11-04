package ex21jdbc.statement;

import java.sql.SQLException;

public class UpdateQuery extends ConnectDB {
	public UpdateQuery(String user, String pass) {
		// 부모클래스의 인자생성자 호출
		super(user,pass);
	}
	@Override
	void execute() {
		try {
			stmt = con.createStatement();
			String sql = "UPDATE member SET pass='1111', name='이순신', regidate=sysdate "
					+ " WHERE id='ko1' ";
			System.out.println("sql= "+ sql);
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected+"행이 업데이트되었습니다.");
		}
		catch(SQLException e) {
			//커넥션URL이나 계정명이 잘못되었을때 발생
			System.out.println("쿼리실행 실패");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("알수없는 예외발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new UpdateQuery("kosmo","1234").execute();
	}
	


}
