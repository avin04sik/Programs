package stringprogams;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String oldString,reverseString="";
		
		System.out.println("Enter the String:---");
		
		Scanner sc= new Scanner(System.in);
		
		oldString= sc.nextLine();
		
		
		String[] words = oldString.split(" ");
	
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			/* The charAt() function returns the character
			 * at the given position in a string
			 */
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reverseString = reverseString + reverseWord + " ";
		}
		System.out.println("Reversed String is :--- "+reverseString);
	}

}
