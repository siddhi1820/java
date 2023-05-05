package pro1;
import java.io.File;
class sc{
	public static void main(String[] args) {
		//create a new file
		try {
      // we create new file 
		File f=new File("myfile.txt");
		System.out.println("File sucessfully created.");
		}
		catch(Exception e) {
      //if file is already existed then exception is catch.
			System.out.println("File already exsisted!");
		}
		
	}
}
