package org.training.exception;

public class AdminCredentials {
	
	public void checkCredentials(String username, String password) throws InvalidAdminException
	{
		if(username.equalsIgnoreCase("Manager") && password.equalsIgnoreCase("root"))
		{
			System.out.println("admin login successfull");
		}
		else
			throw new InvalidAdminException("only admins are allowed to login");
	}

}

