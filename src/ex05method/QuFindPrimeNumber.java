package ex05method;

public class QuFindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		for(int i=2;i<=100;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
				cnt++;
			}
			
		}
		System.out.println("1~100까지 소수는 "+cnt+"개");
	}
	static boolean isPrimeNumber(int a) {
		for(int i=2;i<a-1;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}

}
