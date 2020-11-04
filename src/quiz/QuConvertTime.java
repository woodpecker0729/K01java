package quiz;

import java.util.Scanner;

public class QuConvertTime {
	public static void convertTime(int n) {
		int hour = n / 3600;
		int minute = n / 60 % 60;
		int second = n % 60;
		System.out.printf("%d시간 %d분 %d초",hour,minute,second);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("시간으로 변환할 초(second)를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		convertTime(num);
	}

}
