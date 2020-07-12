package com.test.TestScripts;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class ExtractDataFromResponse {
	
	@Test
	public void extractresponseData()
	{
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/employee/";
		RestAssured.basePath ="2";
		
		Response response = given()
		
		.when()
				.get()
		.then()
				.statusCode(200)
				//.body("status", equalTo("success"))
		.extract().response();
		
		String resjsonAsString = response.asString();
		System.out.println("the response is " +resjsonAsString);
		JsonPath json_path = new JsonPath(resjsonAsString);
		String response_status = json_path.getString("status");
	}

}
