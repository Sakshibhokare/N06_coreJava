package Operators;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
//		preincrement ++x, --x
//		postIncrement x++, x--
		
		int x=23, y=6;
		int res1=x++ + ++y;// 23 + 7
		System.out.println(res1);
		System.out.println(x);
		System.out.println(y);
		
		
		int p=20, s=10;
		int res2=s++ + ++p - s-- + --p + ++s;//10 + 21 - 11 + 20 + 11
		System.out.println(res2);
		System.out.println(p);
		System.out.println(s);

	}

}
