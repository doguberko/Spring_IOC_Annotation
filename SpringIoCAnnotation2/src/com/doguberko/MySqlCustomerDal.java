package com.doguberko;

import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements ICustomerDal {
	
	@Value("${database.connectionString}")
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
