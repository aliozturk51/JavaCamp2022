package abstractDemo;

public class abstractDemo {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new SqlServerDatabaseManager();
		customerManager.getCustomers();
		
	}

}
