/**
 * 
 */
package javaprograms;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 10050725
 *
 */
public class FindDuplicateNums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int list[] = new int[10];

		// Form a list of numbers from 0-9.
		for (int i = 0; i < 10; i++) {
			list[i]=i;
		}

		// Insert a new set of numbers from 0-5.
		for (int i = 5; i < 10; i++) {
			//System.out.println(i);
			list[i]=i-5;
			//System.out.println(list[i]);
		}

		System.out.println("Non filtered Array : ");
		for (int i = 0; i < 10; i++) {
			System.out.println(list[i]);
		}
	
	int j=0;
	for(int i=0;i<5;i++){
		j=list[i];
		for(int x=5;x<10;x++){
			if(j==list[x]){
				System.out.println("Dupliacte Num:--- "+j);
				break;
			}
		}
	}
		
		
	}

	
}
