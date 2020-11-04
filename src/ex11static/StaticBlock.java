package ex11static;

public class StaticBlock {
	int instanceVAr;
	
	void instanceMethod() {}
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
	
	static {
		staticVar = 1000;
		int localVar;
		localVar= 1000;
		System.out.println("localVar="+localVar);
		
//		System.out.println("localVar="+localVar);
//		instanceMethod();
		
		System.out.println("localcVar="+localVar);
		System.out.println("staticVar="+staticVar);
		//staticMethod();
		System.out.println("===static block");
	}
	public StaticBlock() {
		staticVar =-1;
		System.out.println("====생성자====");
	}
	/*public static void main(String[] args) {
		System.out.println("==메인메소드==");
		//System.out.println("localVar="+localVar);
	}*/
	


}

