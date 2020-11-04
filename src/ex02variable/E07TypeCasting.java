package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 자동형변환 : 작은 상자의 데이터를 큰 상자에 대입할 때 자동으로 형변환이 일어난다.
		 */
		byte b1 = 65;
		short s1;
		s1 = b1; // byte<short
		System.out.printf("b1은 %d, s1은 %d%n", b1, s1);
		/*
		 아래코드는 자동형변환은 아님. CPU는 int보다 작은 자료형을 int로 간주하고 연산을 진행하며,
		 결과도 int로 반환한다. CPU의 특성이라 생각하자.
		 */
		int num1 = b1+ s1;
		int num2 = num1;
		System.out.println("num1은 "+num1);
		/*
		 char형(문자타입)에 byte형(숫자타입)을 바로 대입할 수 없다.
		 성질이 다르므로 명시적 형변환 후 대입해야 한다.
		 */
		//char ch1 = b1;
		char ch2 = (char)b1;
		System.out.println("b1="+b1+", ch2="+ch2);
		
		/*
		 명시적 형변환: 큰 상자의 자료를 작은 상자의 자료형에 할당해야할 때 사용함. 단, 자료의 손실이 있을 수 있으므로 필요한 경우에만 사용
		 */
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.printf("데이터미손실:b2=%d, s2=%d\n",b2,s2);
		/*
		소수점 아래 부분이 버려지므로 데이터 손실 있음. 따라서 특수한 경우가 아니라면 사용을 자제해야함.
		 */
		int num3;
		double dl = 3.14;
		num3 = (int)dl;
		System.out.printf("데이터손실:num3=%d, dl=%.2f %n",num3,dl);
		/*
		 char와 int를 연산하면 결과는 int이므로 char형 변수에 대입하려면 명시적 형변환 후 대입해야한다.
		 */
		char ch3 = 'A', ch4;
		int num4 = 2;
		//ch4 = ch3 + num4;
		ch4 = (char)(ch3+num4);
		System.out.println("ch4="+ch4);
	}

}
