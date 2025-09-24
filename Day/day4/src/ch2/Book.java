package ch2;

public class Book extends Product {

	private String author = "abc";

	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	// 메서드: 부모 클래스의 메서드 + 저자명 출력
	public void showBook() {
		showInfo();
		System.out.println("저자: " + author);
	}

}
