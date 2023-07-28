//Ask a user for their birth year and input it as two digit like: if birth year is 2003 the 03 
//and foe the current year also encoded as two digits like 2023 23. write a program to find
//user curent age in years 

package org.tnsif.codingChallenge;

import java.util.Scanner;

public class AgeCalulator {
	
	static void ageCalculator(int by, int curr) {
		if(curr>by)
			System.out.println(curr-by);
		else
			System.out.println((100-by)+curr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter birth year and Current year");
		
		int bYear=s.nextInt();
		int curr=s.nextInt();
		
		
		ageCalculator(bYear, curr);
		
	}

}
