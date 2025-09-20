package sportsmanage;

public class SportsManageDTO {
	private String name; //회원이름
	private int num; // 회원번호
	private int bc; //기준칼로리
	private int cc; //소비칼로리
	
	public SportsManageDTO() {}
	
	public SportsManageDTO(String name, int num, int bc, int cc) {
		this.name = name;
		this.num = num;
		this.bc = bc;
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "회원 이름:" + name + ", 회원 번호:" + num + ", 기준 칼로리:" + bc + ", 소비 칼로리:" + cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getBc() {
		return bc;
	}

	public void setBc(int bc) {
		this.bc = bc;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
