
public class ThreadPauseStage {

	public static void main(String[] args) {
		PrintNumber printNumber=new PrintNumber();  //new/born stage
		PrintTable table=new PrintTable(printNumber);
		
		printNumber.setTable(table);
		table.start();
		printNumber.start();//Runnable stage

	}

}

class PrintNumber extends Thread{
	PrintTable table;
	public void setTable(PrintTable table) {
		this.table=table;
	} 
	public void run(){
		for(int i=1; i<=10;i++) {
			System.out.println("i " + i);
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e){
				e.printStackTrace();
				
			}
		}
		table.resume();
	}
}

class PrintTable extends Thread{
	PrintNumber number;
	public PrintTable(PrintNumber number) {
		this.number = number;
	}
	
	public void run() {
		suspend();
		try {
			number.join(8000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		for(int i=1; i<=10;i++) {
			System.out.println("5" +"*"+ i + "=" + (5*i));
		}
	}
	
	
}













