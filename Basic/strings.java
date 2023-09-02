/*
 * Strings in java:=
 * String is a collection of characters.
 * methods in String:=
 * 1)String concatenation
 * 2)length of string
 * 3)Substring 
 * 4)String comparison
 * 5)Searching in string
 * 6)case conversation
 * 7)Triming spaces
 * 8)Splitting string
 * 
 */
package basic;

public class strings{

	public static void main(String[] args) {
		// String concatenation
		String str1="hello";
		String str2="world";
		System.out.println(str1+str2); //using + operator we perform concatenation.
		//or
		System.out.println(str1.concat(str2)); //using concat method .
		
		//String length method
		String str3="welcome to india.";
		System.out.println("Total length of string is "+str3.length());
       
		//String comparision method
		String str4 = "apple";
		String str5 = "banana";

		boolean areEqual = str4.equals(str5);
		System.out.println("Are equal: " + areEqual); // Output: false

		int comparisonResult = str4.compareTo(str5);
		System.out.println("Comparison result: " + comparisonResult);
		// Output: a negative value indicating str1 is lexicographically before str2
    
		 //triming spaces method
		String text = "   Hello, World!   ";
		String trimmed = text.trim();
		System.out.println(trimmed); // Output: "Hello, World!"
		
		//string case conversion method
		String str7 = "Hello, Java!";
		String uppercase = str7.toUpperCase();
		System.out.println(uppercase); // Output: "HELLO, JAVA!"

		String lowercase = str7.toLowerCase();
		System.out.println(lowercase); // Output: "hello, java!"
		
      
		//Spliting string method
		
		String data = "apple,banana,grape";
		String[] fruits = data.split(",");
		for (String fruit : fruits) {
		    System.out.println(fruit);
		}
		// Output:
		// apple
		// banana
		// grape

       //searching string method
		
		String data2 = "Hello, World!";
		int index = data2.indexOf("World");
		System.out.println("Index of 'World': " + index); // Output: 7

		boolean containsJava = data2.contains("Java");
		System.out.println("Contains 'Java': " + containsJava); // Output: false
  
		//String extraction method
		
		String text1 = "Hello, World!";
		String sub = text1.substring(7); // Extract from index 7 to the end
		System.out.println(sub); // Output: "World!"

		String sub2 = text1.substring(0, 5); // Extract from index 0 to 5 (exclusive)
		System.out.println(sub2); // Output: "Hello"

	}

}
