//Java program Swap two numbers.

import java.util.Scanner;
class swap
{
public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st number:");
   int num1=sc.nextInt();
   System.out.println("Enter 2nd number:");
   int num2=sc.nextInt();
   System.out.println("Before swap:"+"num1="+num1+","+"num2="+num2);
   int temp;
   temp=num1;
   num1=num2;
   num2=temp;
   System.out.println("After swap:"+"num1="+num1+","+"num2="+num2);
   }
}

/* 
output

C:\Users>javac swap.java

C:\Users>java swap
Enter 1st number:
10
Enter 2nd number:
20
Before swap:num1=10,num2=20
After swap:num1=20,num2=10

C:\Users>
*/