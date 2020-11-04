package quiz;

import java.util.Scanner;

public class QuSusik2K {
	public static void susik2K(int n) {
		if(n==0) {
			System.out.println("공식을 만족하는 k값 : 없음");
		}
		else if(n== 1) {
			System.out.println("공식을 만족하는 k값 : 0");
		}
		else {
			int num = 2;
			int k = 1;
			for(;num*2<=n;k++) {
				num*=2;
			}
			System.out.println("공식을 만족하는 k값 :"+k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수n을 입력하세요(0이상의정수):");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		susik2K(num);
	}

}

