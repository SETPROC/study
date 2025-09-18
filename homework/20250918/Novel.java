package test;

public class Novel extends Book{
	String genre;
	public Novel(String name, String author, int price) {
		super(name, author, price);
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
