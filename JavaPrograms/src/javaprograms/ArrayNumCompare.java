package javaprograms;

import java.util.Scanner;

public class ArrayNumCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		 Scanner reader = new Scanner(System.in);
	        System.out.print("Enter the size of array: ");
	        // nextInt() reads the next integer from the keyboard
	        int arrSize = reader.nextInt();
	        int arry[] = new int[arrSize];
	        System.out.print("Enter array items: ");
	        
	        for(int i=0;i<arrSize;i++)
	        	arry[i]=reader.nextInt();
	 
	 
	      String compare= answer(arrSize, arry);
	      System.out.println(compare);
	      
	     
	}

	private static String answer(int arrSize, int[] arry) {
	
	       int flag=0;
	       
	       int arrFirstHalf[]=new int[arrSize/2];
	       int arrSecondHalf[]=new int[arrSize/2];
	       
	       
	       for(int i=0;i<arrSize;i++){	       
	    	   if(i<arrFirstHalf.length)
	    		   arrFirstHalf[i]=arry[i];
	    	   
	    	   else if((arrFirstHalf.length<=i)&&(i<arrSize))
	    		   arrSecondHalf[i-arrSecondHalf.length]=arry[i];
	    	   
	    	   
	       }
	     
	       for(int i=0;i<arrFirstHalf.length;i++){
	    	   if(arrFirstHalf[i]==arrSecondHalf[i])
	    		   flag=1;
	    	   else 
	    		   flag=0;
	       }
	       if(flag==1)
	    	   return "Yes";
	       else		   
	       return "No";
	}

}
