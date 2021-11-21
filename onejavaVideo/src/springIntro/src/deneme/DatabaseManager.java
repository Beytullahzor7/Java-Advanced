package deneme;

public class DatabaseManager {
	private DatabaseService databaseService;

	public DatabaseManager(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}
	
	public void add() {
		databaseService.add();
	}
	

}
