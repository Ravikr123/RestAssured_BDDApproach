package com.test.Utility;

import org.apache.commons.lang3.RandomStringUtils;

public class RandaomTestDataGenerator {
	
	public static String getFirstname()
	{
		String generated_firstName = RandomStringUtils.randomAlphabetic(1);
		return ("Ravi"+generated_firstName);
	}
	
	public static String getLastName()
	{
		String generated_lastName = RandomStringUtils.randomAlphabetic(1);
		return ("Kumar"+generated_lastName);
	}
	
	public static String getUserName()
	{
		String generated_userName = RandomStringUtils.randomAlphabetic(3);
		return ("User"+generated_userName);
	}
	
	public static String getPassword()
	{
		String generated_Password = RandomStringUtils.randomAlphabetic(1);
		return ("Pass"+generated_Password);
	}
	
	public static String getEmailAddress()
	{
		String generated_emailAddress = RandomStringUtils.randomAlphabetic(4);
		return (generated_emailAddress+"@gmail.com");
	}
	
	public static String getEmpName()
	{
		String generated_empName = RandomStringUtils.randomAlphabetic(4);
		return ("John"+generated_empName);
	}
	
	public static String getEmpSalary()
	{
		String generated_empSal = RandomStringUtils.randomNumeric(5);
		return (generated_empSal);
	}
	
	public static String getEmpAge()
	{
		String generated_empSal = RandomStringUtils.randomNumeric(2);
		return (generated_empSal);
	}
	

}
