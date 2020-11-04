package ex04controlstatement;

import java.util.Scanner;

public class Qu_04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int kor,eng,math,avg;
		System.out.print("국어:");
		kor = scanner.nextInt();
		System.out.print("영어:");
		eng = scanner.nextInt();
		System.out.print("수학:");
		math = scanner.nextInt();
		/*
		 switch문은 if문과 같은 조건식을 사용할 수 없고 산술식만 사용할 수 있으므로 정수의 구간을 구하기 위해 총점을 30으로 나눠준다.
		 */
		
		avg = (kor+eng+math)/3;
		System.out.println("평균점수:"+avg);
		switch(avg/10) {
		case 10: case 9:
			System.out.println("학점:A");break;
		case 8:
			System.out.println("학점:B");break;
		case 7:
			System.out.println("학점:C");break;
		case 6:
			System.out.println("학점:D");break;
		default:
			System.out.println("학점:F");
		}
	}
}
