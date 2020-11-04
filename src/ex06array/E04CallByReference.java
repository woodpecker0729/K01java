package ex06array;

public class E04CallByReference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100, 200};
		System.out.println("[main메소드]-swap전 출력");
		for(int i=0;i<arr.length ; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		callByReference(arr);
		System.out.println("[main메소em]-swap후 출력");
		for(int i=0;i<arr.length ; i++) {
			System.out.println(arr[i]+" ");
		}
	}
		public static void callByReference(int[] ref) {
			int temp;
			temp = ref[0];
			ref[0] = ref[1];
			ref[1] = temp;
		
		}
}
