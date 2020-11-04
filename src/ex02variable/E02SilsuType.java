package ex02variable;

public class E02SilsuType {
	public static void main(String[] args) {
		/*
		 실수 자료형
		 -정수형보다는 실수형이 더 큰 자료형이다.(0과 1사이에 무수히 많은 실수가 존재하기 때문)
		 -따라서 long과 float를 연산하면 결과는 float가 된다.
		 */
		long long1 = 100;
		float float1 = 200;
		float result1 = long1+float1;
		System.out.println("long1 + float1 = "+result1);
		/*
		 float와 long의 연산 결과를 long으로 받는 방법
		 1. float 를 long으로 형변환 후 연산
		 2. 계산결과 전체를 long형으로 명시적(강제)형변환한다.
		 */
		long result2 = long1 + (long)float1;
		System.out.println("형변환 후 연산 = " + result2);
		float f3 = 100;
		/*
		 실수형에서 기본형은 double이다
		 소수점이 있는 데이터를 컴파일러는 무조건 double로 인식한다.
		 단, 소수점이 없는 데이터는 float에 대입할 수 있다.
		 소수점이 있는 데이터를 float에 대입하려면 접미사(f or F)를 사용한다.
		 형변환도 가능하지만 java에서는 권장하지 않는다.
		 */
		//float f4 = 3.14; => 에러 발생 3.14를 double 형으로 인식
		float f4 = (float)3.14;
		System.out.println("f4="+f4);
		float f5 = 3.14f;//접미사f를통해 float형을 표현(권장사항)
		System.out.println("f5="+f5);
		float f6 = f3+f4;
		System.out.println("f6="+f6);
		
		double d1 = 3.14;
		double d2 = f6 + d1; // f+d = d 큰쪽을 따라감
		System.out.println("d2="+d2);

	}
}
