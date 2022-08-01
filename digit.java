//Java program to count number of digit in given number.

import java.util.Scanner;
class count
{
public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number:");   
     int num=sc.nextInt(),sum=0;
     System.out.println("Number is "+num);   
     while(num!=0)
     {
      num=num/10;

      sum=sum+1;
     }
     System.out.println("Total number of digit is "+sum);   
  } 
}

/* 
output
C:\Users>javac digit.java

C:\Users>java count
Enter number:
10223
Number is 10223
Total number of digit is 5
C:\Users>

*/