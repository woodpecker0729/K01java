package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[10];
		int sum = 0;
		System.out.println("초기화된 배열 요소");
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			System.out.print(a[i]+" ");
			sum+=a[i];
		}
		System.out.println();
		System.out.print("배열전체요소의합:"+sum);
	}

}
