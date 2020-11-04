package quiz;

import java.util.Random;

public class BubbleSort {
	final static int arrLen = 10;
	public static void bSort(int[] arr) {
		for(int j=1;j<arr.length;j++) {
			for(int i=0;i<arr.length-j;i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			System.out.printf("[%2d회 정렬 결과]  ",j);
			for(int k=0;k<arr.length;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] array = new int[arrLen];
		for(int i=0;i<arrLen;i++) {
			array[i]=random.nextInt(99)+1;
			for(int j=0;j<i;j++) {
				if(array[i]==array[j]) i--;
			}
		}
		System.out.println("배열 크기 : "+arrLen);
		System.out.println("[정렬 전]");
		for(int k=0;k<array.length;k++) {
			System.out.print(array[k]+" ");
		}
		System.out.println("\n-----------------------------------------------------------------------------------");
		
		bSort(array);
	}
}
