package quiz;

import java.util.Scanner;

public class QuBuyObject {
	public static void buyObject(int n) {
		if (n%100!= 0) {
			System.out.println("100원 단위로 계산해요");
			return;
		}
		int money = n/100;
		int cnt = 0;
		int bread,snack,drink;
		if (money <= 15) {
			System.out.println("돈 더 주세요");
		}
		else{
			for(bread=5;bread<money;bread+=5) {
				for(snack=7;snack<money;snack+=7) {
					for(drink=4;drink<money;drink+=4) {
						if(bread+snack+drink==money) {	
							cnt++;							
							System.out.println("빵:"+bread/5+"개, 과자:"+snack/7+"개, 음료:"+drink/4+"개");
						}
					}
				}
			}
			if(cnt>0) System.out.println("위 방법중 하나를 선택하세욤^^*");
			else System.out.println("구매불가");
		}
	}
	public static void main(String[] args) {
System.out.println("빵:500원\n과자:700원\n음료수:400원\n---------------");
		System.out.print("구매할 금액을 입력하세요(1600원이상):");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		buyObject(num);
	}
}
