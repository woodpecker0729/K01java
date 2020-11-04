package ex12inheritance;
/*
Is-A 관계
	: X Is A Y => X는 Y의 일종이다로 표현가능
	-노트북은 컴퓨터의 일종이다
	-휴대폰은 전화기의 일종이다
	이와같이 Is-A관계가 성립하는 개체를 상속으로 표현하기에
	적합하다. 
 */ 

/*
컴퓨터를 표현 : 기본적인 컴퓨팅 환경을 제공하여 입력된 내용을
	계산한다. 
 */
class Computer{
	String owner; //컴퓨터의 소유주 이름
	
	//생성자메소드
//	public Computer() {
//		//기본생성자
//	}
	public Computer(String name) {
		owner = name;
	}
	
	/*
	private 접근지정자로 선언된 멤버메소드는 외부클래스 혹은
	상속받은 클래스에서 접근이 불가능하므로, public으로 선언된
	메소드를 통해서 간접 호출해야한다. 
	상속관계라면 protected로 선언된 메소드로도 호출할 수 있다.
	 */
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력한 ");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다.");
	}
	/*
	해당 메소드를 protected로 선언하면 상속관계의 하위 객체에서
	호출할 수 있다. 
	 */
	public void calculateFunc() {
		keyboardTouch();
		calculate();
	} 
	/*
	해당 메소드는 내부에서만 접근되므로 호출순서를 지켜 
	실행할수 있도록 캡슐화 하여 정의하였다. 
	 */
}
/*
컴퓨터를 상속한 노트북컴퓨터
	: 컴퓨터가 가지고있는 기본기능에 휴대이용 부분을 확장하여
	정의함. 휴대이용을 위해 배터리 멤버변수가 추가됨.
 */
class NotebookComputer extends Computer {

	int battary;//배터리 충전량

	/*
	부모생성자 호출을 위해 사용하는 super()는 생략은 가능하지만 
	앞에 다른 문장이 먼저오면 오류가 발생되므로 주의해야한다. 
	여기서는 부모의 인자생성자를 호출하고 있다.
	 */
	public NotebookComputer(String name, int initCharge) {
		/*
		여기서 super()를 삭제하게 되면 에러가 발생된다. 
		부모클래스에서 인자생성자를 정의하였기때문에 기본생성자는
		생성되지 않기 때문이다. 
		 */
		super(name);		
		battary = initCharge;
	}
	//배터리 충전을 표현한 멤버메소드
	public void charging() {
		battary += 5;
	}
	//휴대하면서 컴퓨팅을 하는것을 표현한 멤버메소드
	public void movigCal() {
		
		if(battary < 1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		System.out.print("이동하면서 ");

		/*
		 * 아래 메소드는 private으로 선언되었으므로 상속받은 
		 * 자식클래스에서도 접근은 불가능하다. 
		 */
		//keyboardTouch();//에러발생
		//calculate();//에러발생
		calculateFunc();

		battary -= 1;//배터리 차감
	}
}
 
/*
태블릿 노트북 컴퓨터 : 컴퓨터의 기본기능 및 휴대이용 기능 그리고 펜으로 드로잉
	할수있는 기능까지 추가된 클래스
 */
class TabletNotebook extends NotebookComputer{

	String registPencil; //테블릿을 사용하기 위한 펜슬

	public TabletNotebook(String name, int initCharge
			, String pen) {
		super(name, initCharge);
		registPencil = pen;
	}
	//태블릿 사용을 위해 배터리양 체크 및 등록된 펜인지 확인
	public void write(String penInfo) {
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}		
		/*
		A.compareTo(B)
			: 문자열 A와 B를 비교하여 0이 반환되면 같은 문자열로 판단하고
			-1 혹은 1이 반환되면 서로 다른 문자열로 판단하는 String 클래스에
			정의된 메소드.
		 */
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		movigCal();
		System.out.println("스크린에 펜으로 그림을 그린다.");
		battary -= 1;
	}
}

public class E04ISAInheritance {
	
	public static void main(String[] args) {

		NotebookComputer noteBook =
				new NotebookComputer("공유", 5);
		TabletNotebook tablet =
				new TabletNotebook("이동욱", 5, "ISE-1234");

		/*
		배터리가 소모되어 사용할수 없는 상태가 되는지 확인하기 위해
		movingCal()을 여러번 호출한다. 
		 */
		System.out.println("==노트북컴퓨터사용==");	
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();	
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();

		System.out.println("==ISE-1234 펜으로 테블릿사용==");
		tablet.write("ISE-1234");//정상사용

		System.out.println("==XYZ-9876 펜으로 테블릿사용==");
		tablet.write("XYZ-9876");//사용불가
	}
}


