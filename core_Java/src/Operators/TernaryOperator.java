package Operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Syntax:  (expration)?True:False;
		
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		String result=(num%2==0)?"Even":"Odd";
		System.out.println("Result is:"+result);
		s.close();


	}

}
