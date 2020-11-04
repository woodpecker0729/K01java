package ex10accessmodifier;


//  class 정의 시 public, default만 사용

/*
private class PrivateClass1 {
	void myFunc() {
		System.out.println("나는 정의할 수 없는 Class");
	}
}
*/

// default 동일 패키지 내에서만 접근 허용
class DefaultClass1 {
	void myFunc() {
		System.out.println("Defalutclass클래스의 myfunc()메소드 호출");
	}
}
// public 해당 java파일을 대표하는 클래스 다른 패키지에서 접근 가능
public class E01AccessModifier1 {
	
//	동일 클래스 내에서는 private 멤버라 할지라도 접근이 가능하다.
//	즉 동일클래스면 접근지정자에 영향을 받지 않는다.
	private int privateVar;
	int defaultVar;
	public int publicVar;

	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod() 메소드 호출");
	}

	void defaultMethod() {
		privateVar = 200;
		System.out.println("defaultMethod() 메소드 호출");
	}

	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}

}
