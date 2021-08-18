package javaprograms;

import java.util.Scanner;

public class PrintFizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 Scanner reader = new Scanner(System.in);
		System.out.println("Enter boundary value till Fiz BUzz program will run:- ");
		 int size = reader.nextInt();
		 
		 for(int i=1;i<=size;i++){
			 
		        // number divisible by 3 and 5 will 
		        // always be divisible by 15, print  
		        // 'FizzBuzz' in place of the number 
		        if (i%15 == 0 )         
		            System.out.println("FizzBuzz\t");     
		          
		        // number divisible by 3? print 'Fizz' 
		        // in place of the number 
		        else if((i%3) == 0)     
		            System.out.println("Fizz\t");                  
		          
		        // number divisible by 5, print 'Buzz'   
		        // in place of the number 
		        else if((i%5) == 0)                        
		            System.out.println("Buzz\t");                  
		      
		        else // print the number             
		            System.out.println(i+"\t");                  
	  }
	}
}
