package deneme;

public class Main {

	public static void main(String[] args) {
		DatabaseManager databaseManager = new DatabaseManager(new MsSqlManager());
		databaseManager.add();

	}

}
