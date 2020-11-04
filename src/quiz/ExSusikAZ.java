package quiz;

public class ExSusikAZ {
	public static void susikAz() {
		for(int A=0;A<10;A++) {
			for(int Z=9;Z>=0;Z--) {
				if((A*10+Z)+(Z*10+A)==99) {
					System.out.printf("%d%d+%d%d=99",A,Z,Z,A);
					System.out.println();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		susikAz();
	}

}

