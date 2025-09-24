package ch2;

public class User {
	private String name;
	private String email;

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void login() {
		System.out.println("이름: " + name + " 이메일: " + email);
	}

}
