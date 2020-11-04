package ex05method;
/*
 * Method(메소드)
 * : 객체지향 프로그램에서 행동 또는 동작을 의미한다 즉 어떤 하나의 업무를 처리하는 모듈(부속품)이라 정의할수 있다.
 * -메소드는 반드시 class안에 정의해야한다.
 * - 메소드 안에 다른 메소드를 정의할 수 없다.
 * - 변환타입이 없더라도 반드시 void를 명시해야한다.
 * -이름의 규칙은 변수명과 동일하다.( ex: addCalculate())
 * Java에서의 Naming Rule(이름규칙)
 * -클래스명:SimpleFunc -> 대문자로 시작하는 Camel case
 * -메소드명:simplefunc -> 소문자로 시작하는 변형된 Camel case
 * -상수 : SIMPLE_CASE -> 전체를 대문자로 표현하고, 연결된 단어는 언더바를 사용
 * -패키지명: simplefunc -> 전체를 소문자로 표현하고, 연결된 단어가 많더라도 언더바를 사용하지 않는다.
 * 언더바대신 .(닷 혹은 점)을 사용한다.
 */
import javax.naming.NoPermissionException;
/*
 * 메소드형식1] 매개변수도 없고 반환값도 없는 경우 
 * :해당 형식은 주로 출력을 담당하는 기능으로 사용된다. 반환타입은 반드시 void로 기술해야한다.
 */
public class E02MethodType01 {
	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세욤==");
		System.out.println("1.열기 2.계속하기 3.종료");
		System.out.println("================");
	}
	static void noParamNoReturn2() {
		// 경우에 따라 함수의 몸체가 없는 경우도 있음.
	}
	static void noParamNoReturn2(int a) {
		// 동일한 이름의 함수가 정의되었으니 매개변수의 갯수로 구분 가능하므로 다른 함수임.
	}
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[Return문 이전]");
		//return;
		/*
		 * 위와 같이 함수 중간에 return을 쓰ㅔ 되면 함수가 즉시 종료되므로 아래 문장은 실행되지 않는 쓰레기코드가 된다.
		 * 반드시 조건문과 함께 사용되어야 한다. 단, 함수
		 */
		if(returnValue%2==0) {
			System.out.println(returnValue+"는 짝수");
			return;
		}
		System.out.println(returnValue+"는 홀수");
		System.out.println("[Return문 이후]");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
	}

}
