package ex07string;

public class E03StringBuilderBuffer {
	/*
	 * StringBuffer 클래스
	 * String 클래스는 내부 메소드를 이용해서 새로운 문자열을 생성하면 원래 문자열은 변하지 않고 새롭게 생성된
	 * 메모리에 문자열을 저장한다. 기존 메모리가 소멸되고 새로운 메모리가 생성되는 낭비를 막기 위해 StringBuffer 클래스가 사용된다
	 * 해당 클래스는 새로운 메모리를 생성하지 않고 기존 메모리의 문자열을 변환한다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strBuf = new StringBuffer("AB");
		strBuf.append(25);
		//append: 문자열의 끝에 새로운 문자열을 연결한다
		strBuf.append("Y").append(true);
		System.out.println("strBuf="+strBuf);
		
		strBuf.insert(2, false);
		// insert: 지정한 인덱스 위치에 문자열을 삽입한다
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println("strBuf="+strBuf);
		
		System.out.println("String 과 StringBuffer의 참조값 비교");
		String str1 = "코스모";
		String str2 = "코스모";
		if(str1==str2) System.out.println("연결전:주소값동일");
		else System.out.println("연결전:주소값다름");
		
		str1 = str1 + " 영원하라";
		if(str1==str2) System.out.println("연결후:주소값 동일");
		else System.out.println("연결후:주소값다름");
		
		StringBuffer buf = new StringBuffer();
		System.out.println("buf="+buf);
		System.out.println("저장된 문자열크기="+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());
		
		buf.append("KOSMO");
		System.out.println("buf="+buf);
		System.out.println("저장된 문자열크기="+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());
		
		buf.append(" 금일은 StringBuffer공부중임").append(" 오늘은 수욜~~~^^");
		System.out.println("buf="+buf);
		System.out.println("저장된 문자열크기="+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());
		
	}

}
