package common_methods;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Patch_common_method {
	public static int responsestatuscode_extractor(String baseuri, String resource, String req_body)
	{
		RestAssured.baseURI = baseuri;
		int responseStatusCode = given().header("Content-Type", "application/json").body(req_body).when().post(resource)
				.then().extract().statusCode();
		return responseStatusCode ;
			
	}
	public static String responsebody_extractor(String baseuri, String resource, String requestBody)
	{
		RestAssured.baseURI = baseuri;
		String responseBody = given().header("Content-Type", "application/json").body(requestBody)
				.when().post(resource)
				.then().extract().response().asString();
		return responseBody ;
		
	}
	

}
