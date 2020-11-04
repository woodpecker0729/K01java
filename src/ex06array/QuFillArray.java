package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		int[] b = new int[10];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d번째 정수 입력:",i+1);
			a[i]=scanner.nextInt();
		}
		System.out.println("순서대로입력된결과");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		int odd=0,even=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b[even]=a[i];
				even--;
			}
			else {
				b[odd]=a[i];
				odd++;
			}
		}
		System.out.println();
		System.out.println("홀수/짝수구분입력결과");
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
