package Operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		int x=53, y=5;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		
//		<< and >>
//		a=8 and b=1
//		a<<b to * a*2^b
//		8*2^1=16
		
//		a>>b do / 
//		8>>1
//		a/2^b
//		8/2=4
		
		System.out.println(8>>1);
		System.out.println(8<<1);
		
		System.out.println(8>>2);
		System.out.println(8<<2);
		


	}

}
