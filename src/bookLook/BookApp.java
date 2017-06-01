package bookLook;

public class BookApp {

	public static void main(String[] args) {
		
		Book b = new Book("Author Name", "Book Title", "Book Description");
		
		
		print(b.getAuthor());
		print(b.getTitle());
		print(b.getDescription());

	}
	
	private static void print(String p){
		System.out.println(p);
	}

}
