
public class ThreadIntro {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();  //new stage
		myThread.setName("MyCustomThread");
		myThread.setPriority(10);
		myThread.start();//Runnable stage
		
		System.out.println(Thread.currentThread());
		System.out.println("End main Method");
		
		

	}

}

class MyThread extends Thread{
	public void run() {
		System.out.println("This is the my first thread...");
		System.out.println(Thread.currentThread());
	}
}
