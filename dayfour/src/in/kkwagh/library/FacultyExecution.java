//program to demostrate on access specifier 
//driver class 
package in.kkwagh.library;

import in.bkcmet.library.*;
//import bkc library to access methods

public class FacultyExecution {

	public static void main(String[] args) {

		Library l =new Library();
		l.libraryName="Bhujabal Library";
		l.displayPublic();
		
		
//		userId and display private is private, so we can not access into another package
//		or class, only we can access inside the same class 
//		l.userId=286862; 
//		l.displayPrivate();
		
		
		
//		books name and display default method is default we can not access it into 
//		another package only we can access with same package 
//		l.bookName;
//		l.displayDefault();
	}

}
