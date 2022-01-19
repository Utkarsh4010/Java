import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:\\file\\test1.txt\\my");
			ObjectInputStream objin = new ObjectInputStream(fin);
			
			Student st = (Student) objin.readObject();
			
			objin.close();
			fin.close();
			
			System.out.println("ID : " + st.id);
			System.out.println("Name : " + st.name);
			//System.out.println("Gender : " + st.gender);
			
		} catch(Exception e){
			e.printStackTrace();
			
			
		}

	}

}
