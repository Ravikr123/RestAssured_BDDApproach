package com.test.TestScripts;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.Utility.RandaomTestDataGenerator;

public class AutomatePUTCall {
	
	public Map<String,String> map = new HashMap<String,String>();
	
	String emp_name = RandaomTestDataGenerator.getEmpName();
	String emp_sal = RandaomTestDataGenerator.getEmpSalary();
	String emp_age = RandaomTestDataGenerator.getEmpAge();
	
	int employee_Id =15;
	
	@BeforeClass
	public void createPUTRequestBodyData()
	{
		map.put("name", emp_name);
		map.put("salary", emp_sal);
		map.put("age", emp_age);
	}
	
	@Test
	public void updateCustomer()
	{
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/";
		RestAssured.basePath ="update/"+employee_Id;
		
		given()
				.contentType("application/json")
				.body(map)
		.when()
				.put()
		.then()
				.assertThat()
				.statusCode(200)
				.and()
				.header("Content-Type", "application/json;charset=utf-8")
				.and()
				.body("status", equalTo("success"));
	}

}
