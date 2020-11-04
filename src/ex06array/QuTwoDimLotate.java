package ex06array;

public class QuTwoDimLotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(a);
		arrPrint(a);
	}
	
	static void rotate(int[][] a) {
		int[] temp;
		temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
	}
	static void arrPrint(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%-2d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("===============");
	}

}
