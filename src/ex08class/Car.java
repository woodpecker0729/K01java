package ex08class;

public class Car {
	public static final String AUTO = "자동";
	public static final String MANUAL = "수동";

	String carGear = AUTO;
	String carModel;
	int carYear;
	Human owner;

	void drive() {
		System.out.println(owner.name + "이(가)" + carModel + "을 운전한다.");
	}

	void initialize() {
		carModel = "람보르기니";
		carYear = 2017;
		owner = new Human();
		owner.name = "캡틴로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	
	void initialize(String model, int year, String name, int age, int energy) {
		carModel = model;
		carYear = year;
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n",carModel);
		System.out.printf("연식:%d\n",carYear);
		System.out.printf("기억:%s\n",carGear);
		owner.showState();
	}
}
