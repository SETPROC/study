package foodmanage;

public class FoodManageMain {
	public static void main(String[] args) {
		FoodManageDAO dao = new FoodManageDAO();
		FoodManageService service = new FoodManageService(dao);
		FoodManageControl controller = new FoodManageControl(service);
		
		controller.run();
		
	}
}
