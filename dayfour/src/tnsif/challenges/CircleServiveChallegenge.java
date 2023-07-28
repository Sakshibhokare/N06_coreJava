package tnsif.challenges;

import java.util.Scanner;

public class CircleServiveChallegenge {

	static int survive(int n, int k) {
		if(n==1) {
			return 1;
		}
		else {
			return (survive(n-1,k)+k-1)%n+1;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value for n and k");
		@SuppressWarnings("unused")
		int number=sc.nextInt();
		
		@SuppressWarnings("unused")
		int k=sc.nextInt();
		System.out.println(survive(number,k));

	}

}
