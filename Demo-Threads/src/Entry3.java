
public class Entry3 {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new OddNosThread();
//		t1.run();
		t1.start();
		
//		Thread t2 = new EvenNosThread();
//		t1.run();
//		t2.start();
		
		Runnable target = new EvenNosJob();
		Thread t2 =  new Thread(target);
		
		t2.start();
	}
}

class OddNosThread extends Thread{
	
	@Override
	public void run() /*throws NullPointerException, InterruptedException*/{
		try {
			MyUtils.displayOddNos();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class EvenNosJob /*extends Thread*/ implements Runnable{
	
	@Override
	public void run() /*throws NullPointerException, InterruptedException*/{
		try {
			MyUtils.displayEvenNos();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


