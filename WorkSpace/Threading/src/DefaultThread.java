
public class DefaultThread {

	public static void main(String[] args) {
		System.out.println("This is default thread by java");
		
		Thread th = Thread.currentThread();//use to get the object of current thread.
		System.out.println(th);

	}

}
