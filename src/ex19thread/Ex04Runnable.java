package ex19thread;
class Sum{
	int num;
	public Sum() {
		num=0;
	}
	public void addNum(int n) {
		num += n;
	}
	public int getNum() {
		return num;
	}
}
class AdderThread extends Sum implements Runnable{
	int start, end;
	public AdderThread(int s, int e) {
		start = s;
		end = e;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = start ; i<=end ; i++) {
			System.out.println("i="+i);
			addNum(i);
		}
	}
}
public class Ex04Runnable {
	public static void main(String[] args) {
		AdderThread at1 = new AdderThread(1, 500);
		AdderThread at2 = new AdderThread(501, 1000);
		
		Thread thread1 = new Thread(at1);
		Thread thread2 = new Thread(at2);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~1000까지의합:"+(at1.getNum()+at2.getNum()));
	}
}
