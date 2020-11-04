package ex21jdbc.statement;

import java.sql.SQLException;

public class SelectQuery extends ConnectDB{
	public SelectQuery() {
		super();
	}
	/*
	 * ResultSet 클래스
	 * :select문 실행 시 쿼리의 실행결과가 resultSet 객체에 저장된다.
	 * 결과로 반환된 레코드의 처음부터 마지막까지 next()메소드를 통해 확인 후 반복하면서 추출
	 * -getXXX()계열의 메소드
	 * 오라클의 자료형이 
	 * 		number타입: getInt();
	 * 		char/varchar2타입 : getString()
	 * 		-> 오라클 자료형에 상관없이 모든 타입을 추출할 수 있다.
	 * 		date타입 : getDate()
	 * 		메소드로 각 컬럼의 데이터를 추출한다
	 * -인자는 select절의 컬럼순서대로 인덱스(1부터시작)를 사용하거나 컬럼명을 사용할 수 있다.
	 */
	@Override
	public void execute() {
		try {
			stmt=con.createStatement();
			String query = "SELECT id, pass, name, regidate, to_char(regidate, 'yyyy.mm.dd hh24:mi') d1 from member";
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String id =rs.getString(1); // id컬럼
				String pw = rs.getString("pass"); 
				String name = rs.getString("name");
				
				/*
				 오라클의 date타입을 getDate(0로 추출하면 0000-00-00 형태로 출력된다.
				 이 경우 date형 자료가 되기 때문에 java.sql.Date 클래스의 참조 변수로 저장해야 한다.
				 */
				java.sql.Date regidate = rs.getDate("regidate");
				/*
				 오라클의 date타입을 getString()으로 추출하면
				 0000-00-00 00:00:00 형태로 시간까지 출력할 수 있다.
				 만약 문자열을 잘라서 출력하고 싶으면 substring()을 사용한다.
				 */
				String regidate2 = rs.getString("regidate");
				String regidate3 = rs.getString("regidate").substring(0,13);
				String regidate4 = rs.getString("d1");
				
				System.out.printf("%s %s %s %s %s %s %s\n",id,pw,name,regidate,regidate2,regidate3,regidate4);
			}
		}
		catch(SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	public static void main(String[] args) {
		SelectQuery selectSQL = new SelectQuery();
		selectSQL.execute();
	}

}
