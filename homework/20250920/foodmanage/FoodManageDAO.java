package foodmanage;

import java.util.ArrayList;
import java.util.List;

public class FoodManageDAO {

	private List<FoodManageDTO> foodList = new ArrayList<>();

	public void FoodManageAdd(FoodManageDTO dto) {
		foodList.add(dto);
	}
	
	public List<FoodManageDTO> getFoodList(){
		return foodList;
	}
}
