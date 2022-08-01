//Java program check alphabet is vowel or consonant.
/*
vowel=['a','e','i','o','u']
consonant=[b,c,d,f,...z] except a,e,i,o,u
*/

import java.util.Scanner;
class check
{
public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a chracter:");
     char ch=sc.next().charAt(0);
     
     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
     {
       System.out.println(ch+" is a vowel.");
     }
     else
     {
       System.out.println(ch+" is a consonant.");
     }
  } 
}

/* 
output
C:\Users>javac vowel.java

C:\Users>java check
Enter a chracter:
a
a is a vowel.
-----------END--------------
C:\Users>javac vowel.java

C:\Users>java check
Enter a chracter:
c
c is a consonant.

C:\Users>
*/