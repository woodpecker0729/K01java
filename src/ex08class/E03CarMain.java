package ex08class;

public class E03CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("[초기화메소드 호출 전");
		System.out.println("car1.owner="+car1.owner);
		//car1.drive();
		
		System.out.println("[초기화메소드 호출 후]");
		car1.initialize();
		car1.drive();
		car1.showCarInfo();
		
		Car car2 = new Car();
		car2.carGear = Car.MANUAL;
		car2.carModel = "밴틀리";
		car2.carYear = 2018;
		
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		System.out.println("자동차정보와 소유자정보 같이보기");
		car2.showCarInfo();
		
		Car car3 = new Car();
		car3.initialize("스포츠카",2012,"성유겸",8,10);
		car3.showCarInfo();
	}

}
