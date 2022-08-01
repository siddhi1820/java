//Java program to calculate sum of natural number.

import java.util.Scanner;
class sum
{
public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter value:");
     int val=sc.nextInt();
     int total=0;
     for(int i=1;i<=val;i++)
     {
      total=total+i;
     } 
     System.out.println("sum of "+val+" number is "+total);
     
   } 
}

/* 
output
C:\Users>javac sum.java

C:\Users>java sum
Enter value:
10
sum of 10 number is 55

C:\Users>
*/