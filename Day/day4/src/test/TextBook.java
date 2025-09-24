package test;

public class TextBook extends Book {
	String subject;

	public TextBook(String name,String author,int price) {
		super(name,author,price);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
