//Darshan is very much interested in gardening and hence he plants more trees in his garden
//he plants trees in rectangular fashion with the oreder of rows and columns and numbers the 
//trees in row wise order. he planted a mago tree in the first row first cl and 
//last cloumn so given the tree number(t) as a input and row and cl no n 
//yur task is to find out whether the given tree is mango tree or not

package org.tnsif.codingChallenge;

import java.util.Scanner;

public class MangoTreeExecutor {
	static void isMangoTree(int n, int t) {
		if(t%n==0 || t%n==1 || t<n)
			System.out.println("Mango tree");
		else
			System.out.println("Not a Mango Tree");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n and t");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
		

	}

}
