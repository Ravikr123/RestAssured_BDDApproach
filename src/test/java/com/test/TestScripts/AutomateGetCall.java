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
	


}
