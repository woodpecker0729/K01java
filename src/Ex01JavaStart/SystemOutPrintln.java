package Ex01JavaStart;

public class SystemOutPrintln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		/*
		 System.out.println() : 내용 출력 후 자동 줄바꿈
		 System.out.print() : 내용 출력. \n로 줄바꿈
		 System.out.printf() : 서식에 맞는 내용 출력. \n 또는 %n으로 줄바꿈
 		 */
		System.out.println("num1="+num1);
		System.out.print("num1="+num1+"\n");
		System.out.printf("num1=%d%n",num1);
		
		/*
		 print() 문에서의 + 기호의 역할
		  - 숫자끼리는 덧셈연산 수행
		  - 문자열, 숫자, 변수 등 서로 성격이 다른 데이터끼리는 단순 연결
		 */
		System.out.println(7);
		System.out.println(3.14);
		
		System.out.println(3+5); // 숫자와 숫자로 인식하여 덧셈연산 결과 출력
		System.out.println(3.5+5.1);
		
		System.out.println("3+5="+8); // 문자열과 숫자이므로 단순 연결 출력
		System.out.println(3.15+"는 실수입니다."); 
		
		
		System.out.println("3+5"+"의 연산결과는 8입니다."); // 문자열은 연산의 대상이 아니므로 단순 연결 출력
		
		System.out.println("num1은 "+num1+" 입니다."); // 변수와 문자열을 연결해서 출력
		
	}

}
