package ex03operator;

public class E04LogicOperator {
	/*
	 논리 연산자
	 	&& : 논리And. 양쪽 모두가 true일 때 true 반환 나머지 false 반환.
	 	|| : 논리Or. 한쪽만 true이면 true 양쪽 모두 false일 때 false 반환
	 	! : 논리Not. 반대의 논리를 반환.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 20;

		boolean result1 = (num1 == 100 && num2 == 20);
		boolean result2 = (num1 < 12 || num2 >= 30);
		System.out.println("result1의 결과: " + result1);
		System.out.println("result2의 결과: " + result2);
		if (!(num1 == num2)) {
			System.out.println("num1과 num2는 다르다.");
		} else {
			System.out.println("num1과 num2는 같다.");
		}
	}

}
