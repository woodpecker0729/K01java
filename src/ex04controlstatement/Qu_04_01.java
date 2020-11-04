package ex04controlstatement;

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("문자 하나를 입력하세요:");
		int a = System.in.read();
		if(a>=48&&a<=57) {
			if((a-'0')%2==0) System.out.println("2의 배수입니다.");
			else System.out.println("2의 배수가 아닙니다.");
		}
		else System.out.println("숫자가 아닙니다.");
	}

}

