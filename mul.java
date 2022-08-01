//Java program multiply two floating point numbers.
import java.util.Scanner; 
class mul
{
public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 1st number:");
  float number1=sc.nextFloat();
  System.out.println("Enter 2nd number:");
  float number2=sc.nextFloat();
  float result=number1*number2;
  System.out.println("Multiplication is:"+result);
  }
}

/*
Output:
C:\Users>javac mul.java

C:\Users>java mul
Enter 1st number:
2.3
Enter 2nd number:
4.5
Multiplication is:10.349999

C:\Users>
*/