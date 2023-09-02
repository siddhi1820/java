/*
 * Loops in java
 * 1)for loop
 * 2)while loop
 * 3)do while loop
 */
package basic;

public class loops {

	public static void main(String[] args) {
		//for loop
		int n=10;
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
			}
		System.out.println("Sum of N number is: "+sum);
		
		//while loop
		int count=1;
		while(count<=5) {
			System.out.print(count+" ");
			count++;
		}
		System.out.println();  // for new line.
		//do while
		int counter=0;
		do {
			System.out.println("Counter: "+counter);
		}while(counter<0);
		
		}

}
