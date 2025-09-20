package foodmanage;

public class FoodManageDTO {
	private int foodNum; //식자재번호
	private String foodName; //식자재명
	private int foodCnt; // 수량
	private String date; // 등록날짜
	

	public FoodManageDTO() {}
	
	public FoodManageDTO(int foodNum, String foodName, int foodCnt, String date) {
		this.foodNum = foodNum;
		this.foodName = foodName;
		this.foodCnt = foodCnt;
		this.date = date;
	}

	@Override
	public String toString() {
		return "식자재번호 = " + foodNum + ", 식자재명 = " + foodName + ", 수량 = " + foodCnt + ", 등록 날짜 = "
				+ date + "\n";
	}

	public int getFoodNum() {
		return foodNum;
	}

	public void setFoodNum(int foodNum) {
		this.foodNum = foodNum;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodCnt() {
		return foodCnt;
	}

	public void setFoodCnt(int foodCnt) {
		this.foodCnt = foodCnt;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
