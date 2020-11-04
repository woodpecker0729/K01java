package ex08class;
class CalculatorEx {
	int count_add=0,count_min=0,count_mul=0,count_div=0;
	void init() {
		count_add=0;
		count_min=0;
		count_mul=0;
		count_div=0;
		}
	double add(double num1, double num2) {
		count_add++;
		return num1+num2;
	}
	double min(double num1, double num2) {
		count_min++;
		return num1-num2;
	}
	double mul(double num1, double num2) {
		count_mul++;
		return num1*num2;
	}
	double div(double num1, double num2) {
		count_div++;
		return num1/num2;
	}
	void showOpCount() {
		System.out.printf("덧셈횟수:%d\n뺄셈횟수:%d\n곱셈횟수:%d\n나눗셈횟수:%d\n",count_add,count_min,count_mul,count_div);
	}
	
}
public class QuSimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();

	}

}
