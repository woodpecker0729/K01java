package ex18lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ex07Define2Supplier {
	//난수를 생성하여 반환하는 람다식을 매개변수로 받아 cnt개의 난수를 반환함
	public static List<Integer> makeRandomNum(Supplier<Integer>s,int cnt){
		List<Integer>li = new ArrayList<Integer>();
		for(int i=1;i<=cnt;i++) {
			li.add(s.get());
		}
		return li;
	}
	/*
	 * Supplier<T>
	 * 공급자란 의미를 가지고 있고 매개변수는 없으나 리턴값이 있는 get()메소드가 정의되어있음.
	 * 주로 실행후 호출한 곳으로 데이터를 생성후 반환한다.
	 */
	public static void main(String[] args) {
		/*
		 * 위의 get 메소드를 오버라이딩 하여 0~99 사이의 난수를 반환하는 람다식 정의
		 */
		Supplier<Integer> sup = ()->{
			Random random = new Random();
			return random.nextInt(100);
		};
		int rNum = sup.get();
		//get 메소드가 반환하는 Integer객체를 Auto Unboxing에서 int형 변수에 저장한다.
		System.out.println("생성된난수="+rNum);
		
		List<Integer> list = makeRandomNum(sup,10);
		System.out.println("### print문으로 출력1");
		System.out.println("list");
		
		System.out.println("### foreach문으로 출력2");
		for(Integer i : list) {
			System.out.printf("%d ",i);
		}
		System.out.println();
		
		System.out.println("### 이터레이터로 출력");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
	}

}
