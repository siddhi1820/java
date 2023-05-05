package pro1;
import java.io.File;
import java.io.FileWriter;
class sc{
	public static void main(String[] args) {
		//create a new file
		try {
		FileWriter fw=new FileWriter("myfile.txt");//open file to write
	
			fw.write("hello welcome to my file...");//write a file 
		
		System.out.println("Sucessfully write a file");
		fw.close();//File close
		}
		catch(Exception e) {
			System.out.println("File is not found!");
		}
		
	}
}

