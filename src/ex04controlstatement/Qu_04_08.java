package ex04controlstatement;

public class Qu_04_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		while(i>0) {
			int j=1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i--;
		}
	}

}
