/*
 * Conditional statement in java
 * 1)if
 * 2)if-else
 * 3)if-else-if
 * 4)switch
 */
package basic;

public class conditional {

	public static void main(String[] args) {
	 //if statement
		int a=10;
		if(a==10) {
			System.out.println("yes value of a is "+a);
		}
     //if-else statement
		if(a>10) {
			System.out.println(a+" is greater than 10.");
			
			}
		else {
			System.out.println(a+" is not greater than 10.");
		}
		//if-else-if
		if(a<0) {
			System.out.println("Negative Number.");
		}
		else if(a>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Number is 0"); 
		}
	}

}
