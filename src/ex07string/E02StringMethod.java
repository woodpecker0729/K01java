package ex07string;

public class E02StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 클래스의 주요 메소드");
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자";
		
		System.out.println("str1의 길이: "+ str1.length());
		System.out.println("str2의 길이: "+ str2.length());
		System.out.println("str1의 두번째 문자:"+str1.charAt(1));
		System.out.println("str2의 두번째 문자:"+str2.charAt(1));
		
		String juminNum = "190419-5000000";
		if(juminNum.charAt(7)=='1'||juminNum.charAt(7)=='3') {
			System.out.println("남자입니다.");
		}
		else if(juminNum.charAt(7)=='2'||juminNum.charAt(7)=='4') {
			System.out.println("여자입니다.");
		}
		else if(juminNum.charAt(7)=='5'||juminNum.charAt(7)=='6') {
			System.out.println("외국인입니다.");
		}
		else {
			System.out.println("주민번호가 잘못되었습니다.");
		}
			String str3 = "A";
			String str4 = "B";
			System.out.println(str3.compareTo(str4));
			System.out.println(str4.compareTo(str3));
			System.out.println("ABC".compareTo("ABC")==0?"문자열이같다":"다르다");
			
			System.out.println("JAVA".concat(" WORLD").concat(" Go"));
			System.out.println("JAVA"+" WORLD"+" Go");
		System.out.println(str1.contains("To"));
		System.out.println(str1.contains("to"));
		
		String email1 = "hong@ikosmo.co.kr";
		if(email1.contains("@")&&email1.contains(".")) {
			System.out.println("이메일형식임");
		}
		else {
			System.out.println("이메일형식이아님");
		}
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));
		
		System.out.printf("국어:%d,영어:%d,수학:%d\n",81,92,100);
		String formatstr = String.format("국어:%d,영어:%d,수학:%d\n",81,92,100);
		System.out.println(formatstr);
		
		System.out.println(str1.indexOf("ava"));
		System.out.println(str1.indexOf("J"));
		System.out.println(email1.indexOf("@")!=-1?"이메일형식맞음":"이메일형식아님");
		juminNum = "120403-3012345";
		int index = juminNum.indexOf("-")+1;
		if(juminNum.charAt(index)=='3') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("J"));
		System.out.println("indexOf:"+str1.indexOf("a"));
		System.out.println("lastIndexOf:"+str1.lastIndexOf("a"));
		
		System.out.println("J를 G로 변경하기");
		System.out.println((str1.replace("J", "G")));
		
		System.out.println("java를 KOSMO로 변경하기");
		System.out.println((str1.replace("java", "KOSMO")));
		
		
		String phoneNumber = "010-1234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(int i=0;i<phoneArr.length;i++) {
			System.out.printf("phoneArr[%d]=%s\n",i,phoneArr[i]);
		}
		phoneArr = phoneNumber.split("%");
		 for(int i=0;i<phoneArr.length;i++) {
			System.out.printf("phoneArr[%d]=%s\n",i,phoneArr[i]);
		}
		 System.out.println(str1.substring(3));
		 System.out.println(str1.substring(3,7));
		 String filename = "my.file.images.jpg";
		 int beginIndex = filename.lastIndexOf(".")+1;
		 System.out.println("파일의 확장자는:"+filename.substring(beginIndex));
	}

}
