package ex19thread;
class Increment{
	int num=0;
	public synchronized void Increment() {
		// TODO Auto-generated constructor stub
		num++;
	}
	public int getNum() {
		return num;
	}
}
class IncThread extends Thread {
	Increment inc;
	public IncThread(Increment inc) {
		// TODO Auto-generated constructor stub
		this.inc = inc;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10000;i++) {
			for(int j=1;j<=10000;j++) {
				inc.Increment();
			}
		}
	}
}
public class Ex05Sync2LongTime {
	public static void main(String[] args) {
		Increment inc = new Increment();
		
		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);
		
		it1.start();
		it2.start();
		it3.start();
		try {
			it1.join();
			it2.join();
			it3.join();
		}
		catch(InterruptedException e) {}
		System.out.println("결과:"+inc.getNum());
	}
}
