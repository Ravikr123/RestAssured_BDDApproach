package com.test.TestScripts;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AutmateDeleteCall {
	
	int emp_id = 15;
	
	@Test
	public void deleterecord()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/";
		RestAssured.basePath ="delete/"+emp_id;
		
		given()
		
		.when()
				.delete()
		.then()
				.assertThat()
				.statusCode(200);
				
	}

}
