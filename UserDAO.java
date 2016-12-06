package com.niit.MyFirstWebApp.dao;

public class UserDAO {
	
	// CURD Operations
	// Validations
	
	/* what should be the method signature for validate user
           1.isValidUser
           2.isValidCredentials
           3.ValidateCredentials */
	public static boolean isValidUser(String UserName, String Password)
	{
		// need to connect DB :: we learn later
		//Temporarialy hardcoding the values
		
		if(UserName.equals("Amarjeet")&& Password.equals("12345"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
