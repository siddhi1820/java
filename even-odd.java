//Java program even/odd numbers.

import java.util.Scanner;
class check
{
public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 1st number:");
     int num=sc.nextInt();
     if(num%2==0)
     {
       System.out.println(num+" is Even Number");
     }
     else
     {
       System.out.println(num+" is Odd Number");
     }
  } 
}

/* 
output
C:\Users>javac even-odd.java

C:\Users>java check
Enter 1st number:
21
21 is Odd Number

C:\Users>
--------------------------
C:\Users>java check
Enter 1st number:
20
20 is Even Number
C:\Users\>
*/