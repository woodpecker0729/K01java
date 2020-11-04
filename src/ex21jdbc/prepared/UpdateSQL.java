package ex21jdbc.prepared;

public class UpdateSQL extends IConnectImpl{
	public UpdateSQL() {
		super("kosmo","1234");
	}
	@Override
	public void execute() {
		String sql = "UPDATE member SET name=?, pass=? WHERE id=?";
		try {
			psmt = con.prepareStatement(sql);
			while(true) {
				psmt.setString(3, scanValue("수정할 아이디"));
				psmt.setString(1, scanValue("이름"));
				psmt.setString(2, scanValue("패스워드"));
				
				int affected = psmt.executeUpdate();
				System.out.println(affected + "행이 업데이트 되었습니다.");
			}
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
		new UpdateSQL().execute();
	}

}
