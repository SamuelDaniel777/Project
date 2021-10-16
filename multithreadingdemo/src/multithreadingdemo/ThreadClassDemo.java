package multithreadingdemo;
class ThreaClassDemo2 extends Thread{
	//join demo
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" THread 2 is running ");
		}
    }
	public void dummy() {
			System.out.println("dummy called");
	}
}

public class ThreadClassDemo extends Thread {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" Thread 1 is running ");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadClassDemo tcd=new ThreadClassDemo();
		ThreaClassDemo2 tcd2=new ThreaClassDemo2();
		tcd.setPriority(1);
		tcd2.setPriority(10);
		System.out.println(tcd.getPriority());
		System.out.println(tcd2.getPriority());
		
		System.out.println(tcd.getName());
		System.out.println(tcd2.getName());
		tcd.start();
		tcd2.start();
//		tcd2.sleep(10000); //sleep thread
//		tcd2.stop(); //stop thread
//		tcd.join(); //join thread
//		tcd2.join();
		System.out.println("bye");
	}

}

