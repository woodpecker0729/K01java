package ex05method;

import java.util.Scanner;

public class E03MethodType02_2 {
	static String getHakjum() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수:");
		int kor = scanner.nextInt();
		System.out.print("영어점수:");
		int eng = scanner.nextInt();
		System.out.print("수학점수:");
		int math = scanner.nextInt();
		/*
		 switch문은 if문과 같은 조건식을 사용할 수 없고 산술식만 사용할 수 있으므로 정수의 구간을 구하기 위해 총점을 30으로 나눠준다.
		 */
		double avg = (kor+eng+math)/3.0;
		
		String hakjum ="";
		// 평균값의 구간을 정하기 위해 10으로 나눈 몫을 이용함
		int result = (int)avg/10;
		
		switch(result) {
		case 10: case 9:
			hakjum ="A학점";break;
		case 8:
			hakjum ="B학점";break;
		case 7:
			hakjum ="C학점";break;
		case 6:
			hakjum ="D학점";break;
		default:
			hakjum ="F학점";
		}
		return hakjum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 시나리오] 사용자로부터 국,영,수 점수를 입력받아 평균을 구한 후 학점을 반환하는 메소드를 정의하시오
		 */
		System.out.println("너의 학점은 " +getHakjum()+"이얌~!");
	}////end of main

}////end of class
