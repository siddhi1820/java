//Java program add two integer.
import java.util.Scanner; 
class add
{
public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 1st number:");
  int number1=sc.nextInt();
  System.out.println("Enter 2nd number:");
  int number2=sc.nextInt();
  int result=number1+number2;
  System.out.println("Addition is:"+result);
  }
}

/*

C:\Users>javac add.java
C:\Users>java add
Enter 1st number:
23
Enter 2nd number:
23
Addition is:46

C:\Users\siddh>
*/