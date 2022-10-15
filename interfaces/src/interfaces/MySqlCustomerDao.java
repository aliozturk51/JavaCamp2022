package interfaces;


public class MySqlCustomerDao implements CustomerDao, RepositoryDao {

	@Override
	public void add() {
		System.out.println("MySql eklendi.");
	}



}
