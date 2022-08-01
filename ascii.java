//Java program find ascii value of a character.
/*
Ascii code of A-Z=65 to 90
Ascii of code a-z=97 to 122
*/
import java.util.Scanner;
class ascii
{
public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a character:");
   char ch=sc.next().charAt(0);
   int ascii=ch;
   System.out.println("Ascii value of a given character is:"+ascii);
   }
}

/* 
output

C:\Users>javac ascii.java

C:\Users>java ascii
Enter a character:
a
Ascii value of a given character is:97

C:\Users>
*/