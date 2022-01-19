import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileFolderOperation {

	public static void main(String[] args) throws IOException  {
		//=========folder level operation===========
		
		//File file1 = new File("D:\\file\\New folder\\utkarsh\\u");
		//File file2 = new File("D:\\file\\New folder\\utkarsh\\utk");
		
		//boolean result = file1.mkdir();   //At a time single folder created
		//System.out.println("Folder created :" + result);
		
		//boolean result = file1.mkdirs();   //At a time multiple folder created
		//System.out.println("Folder created :" + result);
		 
		//boolean result = file1.delete(); //delete the folder only if it is empty
		//System.out.println("Folder Deleted : " + result);

		//boolean result=file1.renameTo(file2);
		//System.out.println("Folder renamied :"+ result);
		
		//===========File level operator=============
		File file1 = new File("D:\\file\\test1.txt");
		File file2 = new File("D:\\file\\test1.txt\\my.txt");
		
		//boolean result = file1.createNewFile();
		//file2.createNewFile();
		
		//file1.renameTo(file2);
		
		//file2.delete();
		
		boolean readable = file1.canRead();
		System.out.println("can read file : "+ readable);
		
		boolean writable = file1.canWrite();
		System.out.println("can write file :" + writable);
		
		boolean hidden = file1.isHidden();
		System.out.println("Is Hidden File : " + hidden);
		
		if(file1.isDirectory()) {
			System.out.println("Its a Folder path");
		} else {
			System.out.println("Its a file path");
		}
		
		System.out.println("==============");
		
		File file3 = new File("D:\\file\\java");
		File[]allFiles = file3.listFiles();
		
		for(File f :allFiles) {
			String name = f.getName();
			
			if(name.endsWith(".java")) {
				System.out.println(name);
			} else {
				f.delete();
			}
		}
			
		
		
	}

}
