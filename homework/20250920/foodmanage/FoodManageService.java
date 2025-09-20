package foodmanage;

import java.util.List;

public class FoodManageService {
	private FoodManageDAO dao;

	public FoodManageService(FoodManageDAO dao) {
		this.dao = dao;
	}

	public void addFood(int foodNum, String foodName, int foodCnt, String date) {
		FoodManageDTO dto = new FoodManageDTO(foodNum,foodName,foodCnt,date);
		dao.FoodManageAdd(dto);
	}
	
	public List<FoodManageDTO> findAll(){
		return dao.getFoodList();
	}
}
