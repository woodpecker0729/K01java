package ex21jdbc.prepared;

public class SelectSQL extends IConnectImpl {

	public SelectSQL() {
		super("kosmo","1234");
	}
	@Override
	public void execute() {
		try {
			while(true) {
				String sql = "SELECT * FROM member WHERE name LIKE '%'||?||'%'";
				
				psmt = con.prepareStatement(sql);
				psmt.setString(1, scanValue("찾는이름"));
				rs = psmt.executeQuery();
				while(rs.next()) {
					String id = rs.getNString(1);
					String pass = rs.getNString(2);
					String name = rs.getNString(3);
					String regidate = rs.getNString(4).substring(0,10);
					System.out.printf("%s %s %s %s\n",id,pass,name,regidate);
				}
				
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
		new SelectSQL().execute();
	}

}
