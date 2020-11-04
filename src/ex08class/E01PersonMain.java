package ex08class;

class Person{
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "영화배우";
	
	void eat() {
		System.out.printf("%s(이)가 식사를 한다 \n", name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s(이)가 잠자고 있다\n",age,name);
	}
}

public class E01PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.eat();
		person.sleep();

	}

}
