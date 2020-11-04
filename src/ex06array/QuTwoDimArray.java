package ex06array;

public class QuTwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7},
				{8, 9}
			};
			//값 증가전 출력
			arrPrint(arr);		
			//2만큼 증가시키는 메소드 호출
			addTwoArr(arr, 2);
			//증가후 출력
			arrPrint(arr);
	}
	public static void addTwoArr(int[][] arr, int add)
	{
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]+=add;
			}
		}
	}

	public static void addOneArr(int[] arr, int add)
	{
		for(int i=0; i<arr.length; i++){
			arr[i]+=add;
		}
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
