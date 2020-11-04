package ex19thread;

import javax.swing.text.html.parser.DTD;

class NotThread{
	String title;
	public NotThread(String title) {
		this.title = title;
	}
	void notThreadMethod() {
		for(int i=1; i<=10;i++) {
			System.out.println(String.format("%s]i=%d",title,i));
		}
	}
}
class YesThread extends Thread{
	public YesThread() {
		// TODO Auto-generated constructor stub
	}
	public YesThread(String threadName) {
		// TODO Auto-generated constructor stub
		super(threadName);
	}
	void threadMethod() throws InterruptedException{
		for(int i=1;i<=10;i++) {
			System.out.println(String.format("%s]i=%d",getName(),i));
			sleep(2000);
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			threadMethod();
		}
		catch(InterruptedException e) {}
	} 
	
}
class DeamonThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(String.format("[쓰레드명:%s]Jazz가흘러요~", getName()));
			try {
				sleep(3000);
				System.out.println("3초마다 자동저장");
			}
			catch(InterruptedException e) {
				System.out.println("자동저장시 오류발생 ㅜㅜ");
			}
		}
	}
}
public class Ex03DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotThread nt1 = new NotThread("첫번째 클래스");
		nt1.notThreadMethod();
		NotThread nt2 = new NotThread("두번째 클래스");
		nt1.notThreadMethod();
		
		YesThread yt1 = new YesThread("1st 쓰레드");
		yt1.setName("첫번째쓰레드");
		yt1.start();
		YesThread yt2 = new YesThread();
		yt2.setPriority(Thread.MAX_PRIORITY);
		yt2.start();
		DeamonThread dt = new DeamonThread();
		dt.setDaemon(true);
		dt.start();
		System.out.println("현재활성화된상태의 쓰레드수"+Thread.activeCount());
		System.out.println("현재 실행중인 쓰레드명"+Thread.currentThread().getName());
		System.out.println("메인함수의 우선순위"+Thread.currentThread().getPriority());
		System.out.println("메인함수(Main Thread) 종료");
	}

}
