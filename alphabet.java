//Java program check whether character is alphabet or not.

import java.util.Scanner;
class check
{
public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter value:");
     char ch=sc.next().charAt(0);
     if(ch>='a' && ch<='z'|| ch>='A' && ch<='z')
     {
      System.out.println(ch+" is a alphabet.");
     }
     else
     { 
      System.out.println(ch+" is not alphabet.");
     }
     
     
  } 
}

/* 
output
C:\Users>javac alphabet.java

C:\Users>java check
Enter value:
0
0 is not alphabet.

C:\Users\siddh>java check
Enter value:
a
a is a alphabet.

C:\Users\siddh>java check
Enter value:
$
$ is not alphabet.

C:\Users>
*/