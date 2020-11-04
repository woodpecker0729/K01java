package ex12inheritance;

class Man {
	private String name;
	public Man() {
		System.out.println("Man클래스 디폴트 생성자 호출됨");
	}
	public Man(String name) {
		this.name = name;
		System.out.println("Man 클래스 인자 생성자 호출됨");
	}
	public void tellYourName() {
		System.out.println("내 이름은 "+name+"입니다.");
	}
}
class BusinessMan extends Man {
	private String company;
	private String position;
	
	public BusinessMan(String name, String company,String position) {
		super(name);
		this.company =company;
		this.position = position;
		System.out.println("BusinessMan 생성자 호출");
	}
	public void tellYourInfo() {
		System.out.println("회사명은 "+ company+ "입니다.");
		System.out.println("직급은 "+ position+ "입니다.");
		tellYourName();
	}
}
public class E01BusinessManMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessMan man1 = new BusinessMan("김천국", "Naver", "팀장");
		BusinessMan man2 = new BusinessMan("이낙원", "Daum", "부장");
		
		man1.tellYourInfo();
		man1.tellYourName();
		
		man2.tellYourInfo();
		man2.tellYourName();
	}

}
