package ch1;

public class User {
	
	//id,password는 반드시 필요한 필드
	private String id;
	private String password;
	
	// 생성자
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	

	// 메서드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
