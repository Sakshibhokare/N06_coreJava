package Operators;

import java.util.Scanner;

public class ArithmaticOperators {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Please Enter Two Numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1+num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);


	}

}
