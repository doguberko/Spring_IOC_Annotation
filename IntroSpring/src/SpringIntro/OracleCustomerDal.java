package SpringIntro;

public class OracleCustomerDal implements ICustomerDal {
	
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		System.out.println("Connection str : " + this.connectionString);
		System.out.println("Added to Oracle DB.");
	}

}
