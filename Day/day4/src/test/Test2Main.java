package test;

public class Test2Main {
	public static void main(String[] args) {
		Book a = new Book("가나다", "홍길동", 1000);
		System.out.println("책 이름: " + a.getName());
		System.out.println("저자: " + a.getAuthor());
		System.out.println("가격: " + a.getPrice());
		System.out.println("=======================");

		TextBook b = new TextBook("사회", "마바사", 2000);
		System.out.println("책 이름: " + b.getName());
		System.out.println("저자: " + b.getAuthor());
		System.out.println("가격: " + b.getPrice());
		b.setSubject("사회");
		System.out.println("과목: " + b.getSubject());
		System.out.println("=======================");
		
		Novel c = new Novel("셜록홈즈", "도일", 3000);
		System.out.println("책 이름: " + c.getName());
		System.out.println("저자: " + c.getAuthor());
		System.out.println("가격: " + c.getPrice());
		c.setGenre("소설");
		System.out.println("장르: " + c.getGenre());
		System.out.println("=======================");
	}
}
