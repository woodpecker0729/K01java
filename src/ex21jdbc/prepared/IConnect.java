package ex21jdbc.prepared;

public interface IConnect {
	/*
	 멤버상수
	 	: 인터페이스에 선언된 변수는 무조건 public static final이 붙어 정적상수로 선언된다.
	 */
	String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin://@localhost:1521:orcl";
	/*
	 멤버추상메소드
	 	: public abstract가 붙어 추상메소드로 선언딘다.
	 */
	void connect(String user, String pass);
	void execute();
	void close();
	
	String scanValue(String title);
}
