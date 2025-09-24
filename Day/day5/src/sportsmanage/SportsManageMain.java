package sportsmanage;

public class SportsManageMain {
	public static void main(String[] args) {
		SportsManageDAO dao = new SportsManageDAO();
		SportsManageService service = new SportsManageService(dao);
		SportsManageController controller = new SportsManageController(service);
		controller.run();
	}

}
