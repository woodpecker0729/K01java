package ex08class;
class Triangle{
	double bottom,height;
	void init(double bottom,double height){
		this.bottom=bottom;
		this.height=height;
	}
	void setBottom(double bottom) {
		this.bottom=bottom;
	}
	void setHeight(double height) {
		this.height=height;
	}
	double getArea() {
		return bottom*height/2.0;
	}
}
public class QuTriangle {

	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}


}
