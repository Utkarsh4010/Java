import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.IOException;


public class BinaryFileReadWrite {

	public static void main(String[] args) {
		
		try {
		FileInputStream fin = new FileInputStream("D:\\file\\folder\\New folder\\img\\tree.jpg");
		FileOutputStream fout = new FileOutputStream("D:\\file\\folder\\New folder\\utk.jpg");
		
		int data=0;
		//byte b[]=new byte[20];
		//fin.read(b);
		while((data=fin.read())!=-1) {
			fout.write(data);
		}
		fout.flush();//to ensure all the bytes written inside file
		fout.close();
		fin.close();
		System.out.println("Copy paste is completed");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
