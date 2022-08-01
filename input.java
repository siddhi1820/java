//Take user input as integer and display it.
import java.util.Scanner; 
class input
{
public static void main(String[] args)
  {
  Scanner a=new Scanner(System.in);
  System.out.println("Enter a number:");
  int number=a.nextInt();
  System.out.println("Number is:"+number);
  }
}

/*
C:\Users>javac input.java

C:\Users>java input
Enter a number:
23
Number is:23

C:\Users>
*/