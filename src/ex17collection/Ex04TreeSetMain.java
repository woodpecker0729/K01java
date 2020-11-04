package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;

class MyString implements Comparable<MyString>{
	
	String str;
	public MyString(String str) {
		this.str = str;
	}
	public int getLength() {
		return str.length();
	}
	@Override
	public int compareTo(MyString paramStr) {
		// TODO Auto-generated method stub
		/*
		if(getLength()>paramStr.getLength()) return -1;
		else if(getLength() < paramStr.getLength()) return 1;
		else return 0;
		*/
		if(str.compareTo(paramStr.str)>0) return 1;
		else if(str.compareTo(paramStr.str)<0) return -1;
		else return 0;
	}
	@Override
	public String toString() {
		return str;
	}
}

public class Ex04TreeSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		System.out.println(tree1.add(2));
		System.out.println("저장된 데이터 수:"+tree1.size());
		Iterator<Integer> itr1 = tree1.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moon"));
		tree2.add(new MyString("KOSMO61"));
		tree2.add(new MyString("KOSMO62"));
		tree2.add(new MyString("KOSMO63"));
		tree2.add(new MyString("KOSMO64"));
		
		Iterator<MyString> itr2 = tree2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
