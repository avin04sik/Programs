package stringprogams;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    boolean isPalindrome=false;
    
    
    System.out.println("Enter the string to check palindrome");
    
    Scanner sc=new Scanner(System.in);
    
    String newString= sc.nextLine();
    String reverseString="";
    for(int i=newString.length()-1;i>=0;i--){
    	reverseString= reverseString+ newString.charAt(i);
    }
    	
    if(newString.equals(reverseString))
    	System.out.println(newString+ " is a palindrome !!!!");
    else
    	System.out.println(newString+ " is not a palindrome !!!!");
	}

}
