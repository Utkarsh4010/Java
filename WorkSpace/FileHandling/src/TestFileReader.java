import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("D:\\file\\folder\\New folder\\basics");
			int data=0;
			while((data = reader.read())!=-1) {
				System.out.print((char)data);
			}
			
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
