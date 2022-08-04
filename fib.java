//Write a program find fibonacii series of N number
/*
input:6
logic:0 1 0+1 1+1 1+2 2+3
output:0 1 1 2 3 5
*/
import java.util.Scanner;
class fib
{
public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int a=0,b=1,c;
    System.out.print(a+" "+b+" ");
    for(int i=2;i<n;i++)
    {
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }
 }
}

/*
output:
Enter a number:
5
0 1 1 2 3 

*/