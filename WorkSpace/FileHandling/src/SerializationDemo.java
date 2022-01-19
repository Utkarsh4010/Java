import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;


public class SerializationDemo {

	public static void main(String[] args) {
		Student st = new Student();
		st.id=23;
		st.name="Abcd";
		
		try {
			FileOutputStream fout=new FileOutputStream("D:\\file\\test1.txt\\my");
			ObjectOutputStream objOut= new ObjectOutputStream(fout);
			
			objOut.writeObject(st);
			
			objOut.flush();
			fout.flush();
			
			objOut.close();
			fout.close();
			
			System.out.println("Serialization done successfully");
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
