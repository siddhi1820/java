import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
//import java.io.FileWriter;
class sc{
	public static void main(String[] args) {
		//create a new file
		try {
		FileReader fr=new FileReader("myfile.txt");
		BufferedReader bf=new BufferedReader(fr); 
		System.out.println(bf.readLine());
		}
		catch(Exception e) {
			System.out.println("File is not readable!");
		}
		
	}
}
