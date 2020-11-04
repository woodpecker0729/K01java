package ex06array;

public class E03CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 100, second = 200;
		System.out.println("[main메소드안-호출전]"+"first="+first+", second="+second);
		callByValue(first,second);
		System.out.println("[main메소드안-호출전]"+"first="+first+", second="+second);
		
	}
		public static void callByValue(int fNum, int sNum) {
			int temp;
			temp = fNum;
			fNum = sNum;
			sNum = temp;
			System.out.println("[callbyvalue메소드안]"+"first="+fNum+", second="+sNum);
				
		}

}
