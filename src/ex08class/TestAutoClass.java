package ex08class;

public class TestAutoClass {
	String carname;
	int carYear;
	String owner;
	public TestAutoClass(String carname, int carYear, String owner) {
		super();
		this.carname = carname;
		this.carYear = carYear;
		this.owner = owner;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
