package ex03operator;

public class E03BeekyoOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 20;
		//비교연산자: 좌우측항의 값이 크거나 , 같거나 한지 비교하는 연산자
		if(num1>num2){
			System.out.println("num1이 더 큽니다.");
 		}
		else {
			System.out.println("num2가 더 큽니다.");
		}
		if(num1 != num2) {
			System.out.println("num1과  num2는 다르다.");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
	}

}
