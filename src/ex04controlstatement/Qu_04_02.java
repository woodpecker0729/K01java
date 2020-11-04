package ex04controlstatement;

import java.io.IOException;

public class Qu_04_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("문자 하나를 입력하세요:");
		int a = System.in.read();
		String b = (a>=48&&a<=57)?"숫자입니다":"숫자가아닙니다";
		System.out.println(b);
	}

}
