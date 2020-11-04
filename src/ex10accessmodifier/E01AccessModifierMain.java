package ex10accessmodifier;

import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain {

	public static void main(String[] args) {
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		E01AccessModifier1 one = new E01AccessModifier1();
	//	System.out.println("one.priVar="+one.privateVar);
		System.out.println("one.defVar="+one.defaultVar);
		System.out.println("one.pubVar="+one.publicVar);
	//	one.privateMethod();
		one.defaultMethod();
		one.publicMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		System.out.println("e01AM2 객체 생성 및 접근");
		E01AccessModifier2 two = new E01AccessModifier2();
	//	System.out.println("two.priVar="+two.privateVar);
	//	System.out.println("two.defVar="+two.defaultVar);
		System.out.println("two.pubVar="+two.publicVar);
	//	two.privateMethod();
	//	two.defaultMethod();
		two.publicMethod();
		System.out.println("DefaultClass 객체 생성 및 접근");
	//	new DefaultClass2().myFunc();
	}

}
