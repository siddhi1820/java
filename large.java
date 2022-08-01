//Java program find largest among three number.
/*
a=2,b=4,c=1
output
b is greatest number.
*/

import java.util.Scanner;
class largest
{
public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 1st Number:");
     int num1=sc.nextInt();
     System.out.println("Enter 2nd Number:");
     int num2=sc.nextInt();
     System.out.println("Enter 3rd Number:");
     int num3=sc.nextInt();
     if(num1>num2 && num1>num3)
     {
      System.out.println(num1+" is greatest number:");
     }
     else if(num2>num1 && num2>num3)
     {
      System.out.println(num2+" is greatest number:");
     }
     else
     { 
      System.out.println(num3+" is greatest number:");
     }
     
     
  } 
}

/* 
output
C:\Users>javac large.java

C:\Users>java largest
Enter 1st Number:
10
Enter 2nd Number:
2
Enter 3rd Number:
5
10 is greatest number:

C:\Users>
*/