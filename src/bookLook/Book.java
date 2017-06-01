package bookLook;

public class Book {
	private String title;
	private String author;
	private String description;
	private int price;
	private boolean isInStock;
	
	public Book(String authorName, String bookTitle, String bookDescription) {
		
		this.setAuthor(authorName);
		this.setTitle(bookTitle);
		this.setDescription(bookDescription);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isInStock() {
		return isInStock;
	}

	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}

	public String getDisplayText(){
		return author + title + description;
	}
}
