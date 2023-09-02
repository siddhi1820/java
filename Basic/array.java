/*
 * Array in java:=
 * Array is a collection of similar datatype.
 */
package basic;

public class Array {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		//length of array
		System.out.println(a.length);
		
		//access index element
		System.out.println(a[2]);
		
		//insert element at specific position
		a[2]=45;
		System.out.println(a[2]);
		
		//access all element in array using loop
		for(int ele:a) {
			System.out.print(ele+" ");
		}
		System.out.println();
		//alternative method to declare array
		int arr[]=new int[4]; //here we create array having size 4.
		
		arr[0]=2;
		arr[1]=4;
		arr[2]=6;
		arr[3]=8;
		
		// iterate array
		for(int ele:arr) {
			System.out.print(ele+" ");
		}

	}

}
