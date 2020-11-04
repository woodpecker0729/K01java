package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/*
 * HashMap<K,V>
 * Map<T> 인터페이스를 구현한 컬렉션 클래스.
 * Key,Value의 쌍으로 객체를 저장한다.
 * 키값은 중복될 수 없다. 중복될 경우 덮어쓰기 처리된다. 
 * 키값으로 검색하므로 타 컬렉션보다 속도가 빠르다.ㅐ0
 */
public class Ex05HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		
		System.out.println("name이라는 키값으로 저장된 이전의 값:"+ map.put("name","홍길동"));
		
		int number = 20;
		
		//map.put("age",number);
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		
		System.out.println("저장된 객체수:"+map.size());
		
		System.out.println("name이라는 키값으로 저장된 이전의 값:"+map.put("name","최길동"));
		System.out.println("키값으로 중복 저장 후 객체수:"+map.size());
		
		System.out.println("키값을 알 때:"+map.get("name"));
		
		Set<String> keys = map.keySet();
		System.out.println("[확장for문 적용]");
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(String.format("%s:%s",key,value));
		}
		
		System.out.println("[반복자 사용하기]");
		Set<String> keys2 = map.keySet();
		Iterator<String> it = keys2.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		System.out.println("[value값들만 출력하기]");
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		System.out.println(map.containsKey("name")?"name키값있다":"name키값없다");
		System.out.println(map.containsKey("account")?"account키값있다":"account키값없다");
		System.out.println(map.containsValue("남자")?"남자있다":"남자없다");
		System.out.println(map.containsValue("여자")?"여자있다":"여자없다");
		
		System.out.println("삭제된객체:"+map.remove("age"));
		System.out.println("[age키값을 삭제 후 출력]");
		for(String key : keys) {
			System.out.println(String.format("%s:%s",key,map.get(key)));
		}
		
		map.clear();
		System.out.println("전체삭제 후 객체 수:"+map.size());
	}

}
