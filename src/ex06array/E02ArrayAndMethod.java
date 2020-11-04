package ex06array;

public class E02ArrayAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열을 선언과 동시에 초기화. 요소의 갯수에 의해 크기 결정됨.
		int[] arr = { 1,2,3,4,5};
		//배열 변수만 선언된 상태로 아직 참조하는 배열이 없음                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		int[] ref;
		System.out.println("초기화 직후 출력");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		ref = addAllArray(arr,7);
		System.out.println("메소드 호출 후 출력");
		for(int i=0;i<ref.length;i++) {
			System.out.println(ref[i]+" ");
		}
		System.out.println();
		for(int i=0;i<ref.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}	
	static int[] addAllArray(int[] ar, int addVal) {
		for(int i=0;i<ar.length;i++) {
			ar[i]+= addVal;
		}
		return ar;
	}
}
