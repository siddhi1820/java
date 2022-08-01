//Java program check a number is positive or negative.

import java.util.Scanner;
class check
{
public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     int num=sc.nextInt();
     if(num>0)
     {
      System.out.println(num+" is positive number.");
     }
     else
     { 
      System.out.println(num+" is negative number.");
     }
     
     
  } 
}

/* 
output
C:\Users>javac pos-neg.java

C:\Users>java check
Enter a number:
10
10 is positive number.

C:\Users>java check
Enter a number:
-10
-10 is negative number.

C:\Users>
*/