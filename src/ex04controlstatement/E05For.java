package ex04controlstatement;
/*
 for문 : while문과 같은 반복문으로 초기값, 조건식, 증강식이 한 줄에 있어 반복의 횟수를 명시적으로 알 수 있는 반복문이다
 그러므로 사용빈도가 가장 높다
 형식] 
 	for(초기값;조건식;증강식){
 		실행문장;
 	}
 실행순서]
 	초기값-> 조건식 확인 -> 참일때 실행 -> 증감식 -> 조건식 확인 -> 반복실행 .... -> 조건이 거짓일 때 for문 탈출
 */
public class E05For {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			System.out.println("i="+i);
		}
		
		int sum = 0;
		for (int j=1 ; j<=100;j++) {
			sum += j;
		}
		System.out.println("1~100까지의 합"+sum);
		
		/*
		 시나리오] for문을 이용하여 1~10 사이의 정수 중 2의 배수의 합을 구하는 프로그램을 작성하시오.
		 */
		int total =0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) total+=i;
		}
		System.out.println("1~10사이 2의 배수의 합: "+total);
		
		total = 0;
		for(int i=0;i<10;i+=2) {
			total =i;
		}
		System.out.println("1~10사이 2의 배수의 합(2번): "+total);
		
		int a = 1;
//		for(;;) {
//			System.out.println("나는 for문으로 만든 무한루프입니다."+a);
//			a++;
//		}
//		for(int j=0;j<=5;j++);{
//			System.out.println("??");
//		}
//		System.out.println("위 for문에서 선언한 변수 j="+j);
		System.out.println("위 main함수 지역에서 선언한 변수 total="+total);
		
		int i=0;
		for( ;i<=5;i++) {
			System.out.println("for문 안에서의 i값="+i);
		}
		System.out.println("for문 밖에서의 i값="+i);
		
		/*
		 연습문제] 구구단을 출력하는 프로그램을 for문으로 작성하시오
		 */
		System.out.println("for문으로 제작한 구구단");
		for(int v=2;v<=9;v++) {
			System.out.println(v+"단");
			for(int j=1;j<=9;j++) {
				System.out.printf("%2d x%2d=%2d ",v,j,v*j);
			}
			System.out.println();
		}
		/*
		시나리오] 다음의 출력결과를 보이는 for문을 작성하시오
		출력결과
			0 0 0 1
			0 0 1 0
			0 1 0 0
			1 0 0 0
		해법 : x와 y를 더해서 5개 될때 1을 출력한다.
		 */

		for(int A=1;A<=4;A++) {
			for(int B=1;B<=4;B++) {
				if(A+B==5) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		for(int A=4;A>=1;A--) {
			for(int B=4;B>=1;B--) {
				if(A+B==5) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
		}
	}
}


