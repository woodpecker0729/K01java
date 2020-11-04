package ex19thread;
class MesssageSendingThread extends Thread{
	String message;
	public MesssageSendingThread(String str) {
		// TODO Auto-generated constructor stub
		message=str;
	}
	public MesssageSendingThread(String str,int pri) {
		// TODO Auto-generated constructor stub
		message=str;
		setPriority(pri);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1 ;i<=10000;i++) {
			System.out.println(message + i +"("+getPriority()+")");
			try {
				sleep(1);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}
public class Ex02Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MesssageSendingThread tr1 = new MesssageSendingThread("첫번째");
//		MesssageSendingThread tr2 = new MesssageSendingThread("두번째");
//		MesssageSendingThread tr3 = new MesssageSendingThread("세번째");
//		MesssageSendingThread tr1 = new MesssageSendingThread("첫번째",Thread.MAX_PRIORITY);
//		MesssageSendingThread tr2 = new MesssageSendingThread("두번째",Thread.NORM_PRIORITY);
//		MesssageSendingThread tr3 = new MesssageSendingThread("세번째",Thread.MIN_PRIORITY);
		MesssageSendingThread tr1 = new MesssageSendingThread("첫번째",10);
		MesssageSendingThread tr2 = new MesssageSendingThread("두번째",5);
		MesssageSendingThread tr3 = new MesssageSendingThread("세번째",1);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}

}
