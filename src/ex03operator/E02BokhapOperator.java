package ex03operator;

public class E02BokhapOperator {
	/*
	 복합대입연산자
	 : 산술연산자와 대입연산자를 연결해놓은 형태로 좌우측의 값을 연산하여 좌측의 변수에 대입하는 형태의 구조를 가진다.
	 문법구조상 항상 현재 타입을 유지하는 특성을 가지고 있다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = 3.1;
		e += 2.1;
		e *= 2;
		//e = e + e;
		e+=e;
		System.out.println("e의 결과값: " + e);
		int n = 5;
		//n = n * 2.7; 연산 결과가 double이므로 대입불가함
		n *= 2.7;
		System.out.println("n의 결과값: " + n);
	}

}
