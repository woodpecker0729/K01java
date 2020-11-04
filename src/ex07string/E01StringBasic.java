package ex07string;

public class E01StringBasic extends Object {
	public static void main(String[] args) {
	int num1=10, num2=20;
	String numResult = (num1==num2)? "데이터가같다":"데이터가다르다";
	System.out.println("비교결과: "+numResult);
	/*
	 * String 클래스의 객체생성방법 1
	 * new를 이용한다. new를 사용하면 동일한 문자열이라도 항상 새로운 메모리를 할당하게된다.
	 */
	String str1 = new String("Hello JAVA");
	String str2 = new String("Hello JAVA");
	// str1,str2는 참조값을 가지고 있으므로 아래는 단순한 참조값 비교를 진행한다.
	if (str1==str2) System.out.println("1과 2는 참조주소 같음");
	else System.out.println("1과 2는 참조주소 다름");
	/* 
	 * equals()메소드
	 * Object클래스로부터 상속받은 메소드로 실제 저장된 문자열을 비교하도록 만들어진 메소드이다.
	 * 즉 아래는 객체에 실제 저장된 문자열에 대한 비교가 이루어진다.
	 */
	if (str1.equals(str2)) System.out.println("1과 2는 참조주소 같음");
	else System.out.println("1과 2는 참조주소 다름");
	/*
	 * String 클래스의 객체생성 방법2
	 * "(더블쿼테이션)을 사용한다
	 * 이 경우 내용이 동일하다면 같은 주소를 사용하게 된다.
	 */
	String str3 ="KOSMO";
	String str4 ="KOSMO";
	System.out.println("equals()메소드로 문자열비교:"+str3.equals(str4));
	
	if(str3==str4) {
		System.out.println("주소가같다");
	}
	else {
		
		System.out.println("주소가다르다");
	}
	}
}
