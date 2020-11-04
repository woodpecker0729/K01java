package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex06Define1Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human p1 = new Human("케이윌","남",80);
		Human p2 = new Human("에일리","여",77);
		Predicate<Human> pre = (Human h) -> { 
			return h.getGender().equals("남");
		};
		System.out.println("p.test(p1) => "+pre.test(p1));
		System.out.println("p.test(p2) => "+pre.test(p2));
		
		System.out.println("===============================");

		Human p3 = new Human("임재범","남",97);
		Human p4 = new Human("아이유","여",99);
		List<Human> list1 = Arrays.asList(p1,p2,p3,p4);
		
		double maleAvg = avg(a->a.getGender().equals("남"), list1);
		System.out.println("남자 평균 : "+maleAvg);
		double femaleAvg = avg(b->b.getGender().equals("여"), list1);
		System.out.println("여자 평균 : "+femaleAvg);
		
		System.out.println("===============================");
		List<Integer> list = Arrays.asList(1,3,5,7,9,11,12,14);
		int total;
		total = sum((Integer n)->n%2 ==0,list);
		System.out.println("짝수합: "+total);
		total = sum((Integer n)->n%2 !=0,list);
		System.out.println("홀수합: "+total);
	}
	public static double avg(Predicate<Human> ph,List<Human>li) {
		int pCount =0;
		int tCount =0;
		for(Human h : li) {
			if(ph.test(h)==true) {
				pCount++;
				tCount+=h.getScore();
			}
		}
		return (double)tCount/pCount;
	}

	public static int sum(Predicate<Integer> p, List<Integer> list) {
		int sum=0;
		for(int a: list) {
			if(p.test(a)) {
				sum+=a;
			}
		}
		return sum;
	}
}
