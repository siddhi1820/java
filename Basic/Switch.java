/*
 * Switch statement in java:=
 * when we handle multiple conditions then we used switch statement in java.
 * syntax:=
 * switch(case){
 * case 1:
 *    //statement
 *    break;
 * case 2:
 *    //statement
 *    break;
 * case n:
 *    //statement
 *    break;
 * default:
 *    //statement;
 * } 
 */
package basic;

public class Switch {

	public static void main(String[] args) {
		String day="Tue";
		switch(day) {
		case "Mon":
			System.out.println("Today is Monday.");
			break;
		case "Tue":
			System.out.println("Today is Tuesday.");
			break;
		case "Wed":
			System.out.println("Today is Wednesday.");
			break;
		case "Thur":
			System.out.println("Today is Thursday.");
			break;
		case "Fri":
			System.out.println("Today is Friday.");
			break;
		case "Sat":
			System.out.println("Today is Saturday.");
			break;
			
		case "Sun":
			System.out.println("Today is Sunday.");
			break;
		default:
			System.out.println("Invalid day");
		}

	}

}
