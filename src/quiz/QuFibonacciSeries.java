package quiz;

import java.util.Scanner;

public class QuFibonacciSeries {
	public static void fSeries(int n){
		if(n>=1){
			int[] arr = new int[n];
			arr[0]=0; arr[1]=1;
			for(int i=2;i<n;i++) {
				arr[i]= arr[i-2]+arr[i-1];
			}
			for(int i=0;i<arr.length;i++) {
				System.out.printf("%d ",arr[i]);
			}
		}
		else System.out.printf("2이상의 수 입력");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("출력할 피보나치수열의 항목갯수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		fSeries(num);
	}

}

