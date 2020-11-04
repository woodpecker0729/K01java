package ex18lambda;
interface IKosmo1{
	void studyLambda(String str);
}
class KosmoStudent1 implements IKosmo1{
	//인터페이스를 구현받았으므로 반드시 추상메소드를 오버라이딩 해야한다.
	@Override
	public void studyLambda(String str) {
		System.out.println(str+"을 공부합니다");
	}
}
public class Ex01NormalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단지 메소드 하나를 정의해서 사용하고 싶은데 인터페이스, 상속, 오버라이딩,
		// 객체생성까지의 과정을 거처야 한다. 과정이 너무 복잡한 단점이 있다.
		IKosmo1 Kosmo = new KosmoStudent1();
		Kosmo.studyLambda("람다식");
	}

}
