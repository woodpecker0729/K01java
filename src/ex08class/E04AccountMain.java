package ex08class;
/*
 * 시나리오] 은행계좌를 추상화 해보자
 * 	 멤버변수 : 예금주(name)
 * 			 계좌번호(accountNumber)
 * 			 잔고(Balance)
 * 
 * 	멤버메소드 : 입금하다(deposit())
 * 			  출금하다(withdraw())
 * 			 계좌잔고 ㅊ룰력하기(showAccount()0
 * 
 * 	조건1: 입금은 무제한 가능
 * 	조건2: 잔고가 부족할 경우 출금 불능 처리
 */
class Account{
	String name;
	String accountNumber;
	int balance;
	
	void deposit(int money) {
		balance+=money;
		System.out.println(money+"원이 입금됨.");
	}
	void withdraw(int money) {
		if(balance >= money) {
			balance -= money;
			System.out.println("계좌에서 "+money+"원이 출금됨");
		}
		else {
			System.out.println("잔고부족으로 출금불능");
		}
	}
	void sohwAccount() {
		System.out.println("계좌주:"+name);
		System.out.println("계좌번호:"+accountNumber);
		System.out.println("잔고:"+balance);
	}
	void init(String n, String a, int b) {
		name =n;
		accountNumber = a;
		balance = b;
	}
}
public class E04AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Account account = new Account();
			account.init("장동건", "111-21-8888", 1000);
			account.deposit(9000);
			account.withdraw(5000);
			account.sohwAccount();
				
			Account account2 = new Account();	
			account.name = "장우성";
			account.accountNumber = "123-45-67890";
			account.balance = 900000;
			account.sohwAccount();
	}

}
