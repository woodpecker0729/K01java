package ex08class;

class FruitSeller3 {
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE; // 선언시 초기화와 이후 변경 불가의 이유로 상수에서 변수로 변경
	
	public FruitSeller3(int money, int appleNum, int price){
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

class FruitBuyer3 {
	int myMoney;
	int numOfApple;
	
	public  FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:" + myMoney);
		System.out.println("[구매자]사과갯수:" + numOfApple);
	}
}

public class E06FruitSalesMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FruitSeller3 seller1 = new FruitSeller3(0,100,1000);
			FruitSeller3 seller2 = new FruitSeller3(0,80,500);
			FruitBuyer3 buyer = new FruitBuyer3(10000,0);
			System.out.println("구매행위가 일어나기 전의 상태");
			seller1.showSaleResult();
			seller2.showSaleResult();
			buyer.showBuyResult();
			buyer.buyApple(seller1, 5000);
			buyer.buyApple(seller2, 5000);
			
			System.out.println("구매행위가 일어난 후의 상태");
			seller1.showSaleResult();
			seller2.showSaleResult();
			buyer.showBuyResult();
	}

}
