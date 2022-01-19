
public class SynchronizationDemo1 {

	public static void main(String[] args) {
		Printer print = new Printer();
		PrintTableTh table=new PrintTableTh(print);
		PrintNames name=new PrintNames(print);
		table.start();
		name.start();

	}

}

class PrintTableTh extends Thread{
	Printer printer;
	public PrintTableTh(Printer printer) {
		this.printer=printer;
	}
	public void run() {
		synchronized(printer) {
			for(int i=0;i<=10;i++) {
				printer.print("15 * " + i + "="+(15*i));
				try {
					sleep(1500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				if(i==7) {
					try {
						printer.wait();
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

class PrintNames extends Thread{
	String name[] = {"A", "B", "C","D", "E", "F", "G", "H", "I"};
	Printer printer;
	public PrintNames(Printer printer){
		this.printer = printer;
	}
	public void run(){
		synchronized(printer){
			for(String nm:name) {
				printer.print("Employee name: "+nm);
			}
			printer.notifyAll();
		}
	}
}

class Printer{
	//public synchronized void print(String val){}
	public void print(String val) {
		System.out.println(val);
		
	}
}







