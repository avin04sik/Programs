/**
 * 
 */
package javaprograms;

import java.util.Scanner;

/**
 * @author 10050725
 *
 */
public class AddNums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First Number
		
		 Scanner reader = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        // nextInt() reads the next integer from the keyboard
	        int number1 = reader.nextInt();
	        // println() prints the following line to the output screen
	      //  System.out.println("You entered: " + number1);
	        
	        

			// Second Number
	        
	        System.out.print("Enter the second number: ");
	        // nextInt() reads the next integer from the keyboard
	        int number2 = reader.nextInt();
	        int sum;
	        sum=number1+number2;
	        
	        System.out.println("Sum of entered numbers is: " + sum);
	}

}
