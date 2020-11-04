package ex09package.kosmo.seller;

public class FruitSeller4 {
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE; // 선언시 초기화와 이후 변경 불가의 이유로 상수에서 변수로 변경
	
	public FruitSeller4(int money, int appleNum, int price){
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}

	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:" + numOfApple);
		System.out.println("[판매자]판매수익:" + myMoney);
	}
}
