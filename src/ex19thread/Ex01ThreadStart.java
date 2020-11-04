package ex19thread;
class ShowThread extends Thread{
	String threadName;
	public ShowThread(String name) {
		threadName = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1 ; i<=100 ; i++) {
			System.out.println("안녕하세요.["+threadName+"]입니다.");
			try {
				sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex01ThreadStart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowThread st1 = new ShowThread("쓰레드1st");
		ShowThread st2 = new ShowThread("Thread2nd");
		
		st1.start();
		st2.start();
		
		
	}

}
