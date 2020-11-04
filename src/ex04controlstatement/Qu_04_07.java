package ex04controlstatement;

public class Qu_04_07 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if((i%3==0||i%7==0)&&!(i%3==0&&i%7==0)&&!(i==100)) {
				sum+=i;
				System.out.printf("%d+",i);
			}
			else if(i==100) {
				sum+=i;
				System.out.printf("%d",i);
			}
			
		}
		System.out.printf("=%d",sum);
	}
}
