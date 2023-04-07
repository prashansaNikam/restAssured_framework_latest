package common_methods;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;


public class Get_common_method {
      public static int responsestatus_extractor(String baseuri ,String resource)
      {
    	  RestAssured.baseURI=baseuri;
    	  int response_statuscode =given().when().get(resource).then().extract().statusCode();
    	  return response_statuscode;
	}
	public static String responsebody_extractor(String baseuri, String resource)
      {
    	  RestAssured.baseURI=baseuri;
    	  String response_body = given().when().get(resource).then().extract().response().asString();
    	  return response_body;
    			  
	}
	
}