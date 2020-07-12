package com.test.TestScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AutomateGetCall {
	
	
	@Test
	public void getWeatherDetail() {
		
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city/";
		given().
		when().
			get("Delhi").
		then().assertThat()
			.statusCode(200).and()
			.header("Content-Type", "application/json").and()
			.body("City", equalTo("Delhi"));
	
	}
	
	
	//We can also rite above method in below mentioned format
	@Test
	public void getWeatherDetail2()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";
		RestAssured.basePath = "Delhi";
		
		given()
		
		.when()
				.get()
		
		.then()
		
			.assertThat()
			.statusCode(200).and()
			.header("Content-Type", "application/json").and()
			.body("City", equalTo("Delhi"));
	}
	


}
