package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

/* 
 * ArrayList<E> List 계열의 컬렉션으로 
 * -데이터 중복 저장 허용
 * -데이터 저장 순서 보장
 * - 데이터 접근 시 get 혹은 iterator 사용
 * - 배열의 특성 가지고 있어 인덱스를 통한 저장 및 접근 가능
*/
public class Ex03ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<E> 인터페이스 계열의 컬렉션
		 *  ArrayList<T>와 같은 컬렉션은 제네릭을 기반으로 하지만
		 *  아래와 같이 타입매개변수를 생력하면 모든 객체를 저장할 수 있는
		 *  컬렉션이 된다. 즉 ArrayList<Object>로 선언한 것과 같다.
		 */
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList list = new ArrayList();
		
		// add(객체) : 순차적으로 저장하면서 인덱스는 0부터 자동으로 부여한다.
		// add(인덱스, 객체) : 인덱스 직접 부여해 객체 저장, 인덱스를 건너뛰면 예외 발생
		// size() : 컬렉션에 저장된 객체의 갯수 반환. 배열 크기와 동일
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3,"워너원");
		//list.add(5,"소방차ㅋㅋ"); // 에러발생 - 인덱스 건너 뛸 수 없음.
		list.add(list.size(),"오마이걸");
		list.add(list.size(),"방탄소년단");
		/*
		 * 중복저장 : List 는 배열의 속성을 가지므로 데이터의 중복이 허용된다.
		 * add()메소드는 추가에 성공한 경우 true를 반환한다.
		 */
		System.out.println("중복 저장 전 객체 수: "+list.size());
		System.out.println(list.add("트와이스")? "중복저장됨":"안됨");
		System.out.println("중복 저장 후 객체 수: "+list.size());
		System.out.println("\n[일반for문 사용]");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\n[확장for문 사용]");
		for(Object obj : list) {
			System.out.print(obj+" ");
		}
		System.out.print("\n======================\n");
	
		System.out.println("[반복자(Iterator) 사용]");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.print("\n======================\n");
		
		list.set(4, "오마이걸>덮어쓰기");
		for(Object obj:list) {
			System.out.print(obj + " ");
		}
		System.out.print("\n======================\n");
		
		list.add(4,"블랙핑크>끼워넣기");
		for(Object obj: list) {
			System.out.print(obj + " ");
		}
		System.out.print("\n======================\n");
		
		System.out.println(list.contains("빅뱅")?"빅 있음":"빅 없음");
		System.out.println(list.contains("블랙핑크")?"블 있음":"블 없음");
		Object obj = list.remove(2);
		System.out.println("삭제된 객체:"+obj);
		
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 index="+ index);
		list.remove(index);
		
		System.out.println(list.remove("방탄소년단")?"삭제성공":"삭제실패");
		list.remove("오마이걸");
		System.out.println("삭제 후 출력");
		for(Object ob : list) {
			System.out.print(ob + " ");
		}
		System.out.println();
		
		list.removeAll(list);
		list.clear();
		System.out.println("전체삭제 후 객체 수:"+list.size());
	}

}
