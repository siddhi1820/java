//Java program check leap year.
/*
a leap year exactly divisible by 4 except for century year(century means year ending with 00)
a century year is leap year only if it is divisible by 400.
*/

import java.util.Scanner;
class leap
{
public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter year:");
     int year=sc.nextInt();
     if(year%4==0 && year%100!=0)
     {
      System.out.println(year+" is leap year.");
     }
     else if(year%400==0 && year%100==0)
     {
      System.out.println(year+" is leap year.");
     }
     else
     { 
      System.out.println(year+" is not leap year.");
     }
     
     
  } 
}

/* 
output
C:\Users>javac leap.java

C:\Users>java leap
Enter year:
2004
2004 is leap year.

C:\Users>java leap
Enter year:
1900
1900 is not leap year.

C:\Users>
*/