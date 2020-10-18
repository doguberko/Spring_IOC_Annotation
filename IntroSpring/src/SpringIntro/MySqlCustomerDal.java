package SpringIntro;

public class MySqlCustomerDal implements ICustomerDal {
	
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}


	@Override
	public void add() {
		System.out.println("Connection str : " + this.connectionString);
		System.out.println("Added to MySQL DB.");
	}

}
