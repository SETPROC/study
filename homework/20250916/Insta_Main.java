package ch1;

public class Insta_Main {

	public static void main(String[] args) {
		InstagramPost m = new InstagramPost("민지", "오늘 날씨 짱");
		System.out.println("작성자: " + m.author);
		System.out.println("내용: " + m.detail);
	}

}
