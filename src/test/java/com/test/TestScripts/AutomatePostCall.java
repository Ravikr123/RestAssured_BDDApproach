package com.test.TestScripts;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.test.Utility.RandaomTestDataGenerator;

import io.restassured.RestAssured;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AutomatePostCall {
	
	public Map<String, String> map = new HashMap<String, String>();
	
	@BeforeClass
	public void createPOSTRequestBodyData()
	{
		map.put("FirstName", RandaomTestDataGenerator.getFirstname());
		map.put("LastName", RandaomTestDataGenerator.getLastName());
		map.put("UserName", RandaomTestDataGenerator.getUserName());
		map.put("Password", RandaomTestDataGenerator.getPassword());
		map.put("EmailAddess", RandaomTestDataGenerator.getEmailAddress());
	}
	
	@Test
	public void createNewCustomer()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/customer/";
		
		//Specify the pre-requisite as part of given section
		given()
				.contentType("Application/json")
				.body(map)
			
		.when()
				.post("register")
			
		.then()
				.assertThat()
				.statusCode(201).and()
				.header("Content-Type", "application/json")
				.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
				.body("Message", equalTo("Operation Completed Successfully"));
			
	}
	
	//We can specify the above method in below way also
	public void createNewCustomer2()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/customer/";
		RestAssured.basePath ="register";
		
		given()
				.contentType("application/json")
				.body(map)
		.when()
				.post()
		.then()
				.assertThat()
				.statusCode(201)
				.and()
				.header("Content-Type", "application/json")
				.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
				.body("Message", equalTo("Operation Completed Successfully"));		
			
	}

}
