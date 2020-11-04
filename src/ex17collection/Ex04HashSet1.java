package ex17collection;


import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import common.Teacher;

public class Ex04HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> set = new HashSet<Object>();
		
		String strObject1 = "JAVA";
		String strObject2 = new String("KOSMO61기");
		Date dateObject = new Date();
		int number = 100;
		Teacher teacher = new Teacher("김봉두",55,"체육");
		
		System.out.println(set.add(strObject1));
		set.add(strObject2);
		set.add(dateObject);
		set.add(number);
		set.add(teacher);
		
		System.out.println("[중복전 객체수]:"+set.size());
		
		System.out.println(set.add(strObject2)? "저장성공" :"저장실패");
		System.out.println("[중복 저장후 객체수]:"+set.size());
		Teacher teacher2 = new Teacher("김봉두", 55, "체육");
		System.out.println(set.add(teacher2)?"성공":"실패");
		System.out.println("[중복저장후 객체수]:"+set.size());
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object object = itr.next();
			
			if(object instanceof String) {
				System.out.println("String: "+object);
			}
			else if(object instanceof Date) {
				System.out.println("Date: "+object);
			}
			else if(object instanceof Integer) {
				System.out.println("Integer: "+object);
			}
			else if(object instanceof Teacher) {
				System.out.println("Teacher: "+((Teacher)object).getInfo());
			}
			else {
				System.out.println("넌 뭐임??");
			}
		}
		System.out.println(set.contains(strObject1)?"sO1있다":"sO1없다");
		System.out.println(set.contains("Java")?"Java있다":"Java없다");
		
		System.out.println(set.remove(strObject2)?"o2삭제성공":"o2삭제실패");
		System.out.println(set.remove("Android")?"Android삭제성공":"Android삭제실패");
		System.out.println("삭제후 객체수"+set.size());
		System.out.println("전체삭제:"+set.removeAll(set));
		System.out.println("전체삭제후 객체수:"+set.size());
	}

}
