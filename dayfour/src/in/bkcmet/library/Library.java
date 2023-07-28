//program to demonstrate on access specifier

package in.bkcmet.library;

public class Library {
//	different access specifier
	public String libraryName;
	private long userId;
	String bookName;

	public void displayPublic() {
		System.out.println("Library Name: "+ libraryName);
	}
	
	private void displayPrivate()
	{
		System.out.println("userId : "+userId);
	}
	
	void displayDefault()
	{
		System.out.println("Book Name is:"+bookName);
	}
}
