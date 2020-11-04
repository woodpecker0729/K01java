package ex10accessmodifier;

class FruitSeller {
	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE; // 선언시 초기화와 이후 변경 불가의 이유로 상수에서 변수로 변경
	
	public FruitSeller(int money, int appleNum, int price){
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

class FruitBuyer {
	private int myMoney;
	private int numOfApple;
	
	public  FruitBuyer(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:" + myMoney);
		System.out.println("[구매자]사과갯수:" + numOfApple);
	}
}

public class E03InformationHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FruitSeller seller1 = new FruitSeller(0,100,1000);
			FruitSeller seller2 = new FruitSeller(0,80,500);
			FruitBuyer buyer = new FruitBuyer(10000,0);
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
			
//			seller1.myMoney += 1000;
//			seller1.numOfApple -= 50;
//			buyer.numOfApple += 50;
//			seller2.numOfApple += 1000;
//			seller2.numOfApple -= 70;
//			buyer.numOfApple += 70;
			
			System.out.println("구매행위가 일어난 후의 상태");
			seller1.showSaleResult();
			seller2.showSaleResult();
			buyer.showBuyResult();
	}

}
