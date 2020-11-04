package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<=9;i++) {
			int a=i;
			for(int j=1;j<=9;j++) {
				if(j==1){
					System.out.printf("%2d X 1 =%2d",i,i);
					System.out.println();
					continue;
				}
				else {
					System.out.printf("%2d",i);
					for(int k=1;k<=j-1;k++) {
						System.out.printf(" X%2d",i);
						
					}
				}
				a*=i;
				System.out.printf(" = %d",a);
				System.out.println();
			}
		}
	}

}
