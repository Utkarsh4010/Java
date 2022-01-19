import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {

	public static void main(String[] args)  {
		try{
			FileWriter fw = new FileWriter("D:\\file\\folder\\New folder\\basics");
			fw.write("Hello,this is my First message inside file from java");
			fw.flush();
			fw.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}

	

	}
}
