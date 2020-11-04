package ex03operator;

public class E07BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5	//00000000 00000000 00000000 00000101
		, num2 = 3		//00000000 00000000 00000000 00000011
		, num3 = -1;	//11111111 11111111 11111111 11111111
						/*
						-1이 위와같이 되는 이유는 1을 더했을때 0이 되기 때문이다.
						양의 정수 1을 2의 보수를 취하면 -1이 된다.
						 */
		System.out.println("비트and:" + (num1 & num2));
		System.out.println("비트or:" + (num1 | num2));
		System.out.println("비트xor:" + (num1 ^ num2));
		System.out.println("비트not:" + (~num3));
	}

}