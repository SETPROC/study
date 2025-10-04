package ch1;

import java.sql.Date;

public class YumDTO {
	private int id; //번호(PK)
	private String name;//상호
	private String menu;//메뉴
	private int rating;//평점
	private Date visitDate;//방문 날짜(yyyy-MM-dd)
	private Date regDate;//작성 날짜(yyyy-MM-dd)

	public YumDTO() {}
	
	public YumDTO(int id, String name, String menu, int rating, Date visitDate, Date regDate) {
		this.id = id;
		this.name = name;
		this.menu = menu;
		this.rating = rating;
		this.visitDate = visitDate;
		this.regDate = regDate;
	}
	
	public YumDTO(String name, String menu, int rating, Date visitDate) {
		this.name = name;
		this.menu = menu;
		this.rating = rating;
		this.visitDate = visitDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return String.format("사용자 ID: %d, 이름: %s, 메뉴: %s, 평점: %d, 방문 날짜: %s, 작성 날짜: %s",id, name, menu, rating,visitDate.toString(),regDate.toString());
	}
	
	
}
