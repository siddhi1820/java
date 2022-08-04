//Write a program find factorial of number
/*
input:5
logic:5*4*3*2*1=120
output:120
*/
import java.util.Scanner;
class factorial
{
public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++)
    {
      fact=fact*i;
    }
  
    System.out.println("Factorial of number is:"+fact);
 }
}

/*
output:
Enter a number:
5
Factorial of number is:120

*/