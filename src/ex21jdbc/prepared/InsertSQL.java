package ex21jdbc.prepared;

import java.sql.Date;
import java.util.Scanner;

public class InsertSQL extends IConnectImpl{
	public InsertSQL() {
		super(ORACLE_DRIVER,"Kosmo","1234");
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		try {
		String query = " INSERT INTO member VALUES(?,?,?,?)";
		
		psmt = con.prepareStatement(query);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디:");
		String id = scan.nextLine();
		System.out.print("패스워드:");
		String pw = scan.nextLine();
		System.out.print("이름:");
		String name = scan.nextLine();
		psmt.setString(1, id);
		psmt.setString(2, pw);
		psmt.setString(3, name);
		//날짜를 문자열로 입력하는 경우
		//psmt.setString(4, "2018-11-20");
		
		//날짜를 date타입으로 입력하는 경우
		/*
		 현재 날짜를 java단에서 입력하는 겨우 아래와 같은 변환과정을 거쳐야한다.
		 util패키지를 시간을 가져온 후 sql 패키지로 타입을 변환한다.
		 이때는 date형으로 입력되기 때문에 setDate()
		 */
		java.util.Date utilDate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		psmt.setDate(4, sqlDate);
		
		int affected = psmt.executeUpdate();
		System.out.println(affected+"행이 입력되었습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InsertSQL().execute();
	}

}
