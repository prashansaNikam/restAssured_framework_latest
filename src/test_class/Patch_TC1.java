package test_class;

import java.io.IOException;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import common_methods.Patch_common_method;
import common_methods.common_methods_utilities;
import io.restassured.path.json.JsonPath;
import request_repository.patch_request_repository;

public class Patch_TC1 {
	@Test
	public static void orchestrator() throws IOException {
		String responseBody = "";
		int responseStatuscode = 0;
		String baseuri = patch_request_repository.baseuri();
		String resource = patch_request_repository.resource();
		String requestBody = patch_request_repository.patch_request_tc1();
		for(int i=0; i<5; i++)
		{
			responseStatuscode = Patch_common_method.responsestatuscode_extractor(baseuri, resource, requestBody);
			if(responseStatuscode == 201)
			{
				responseBody = Patch_common_method.responsebody_extractor(baseuri, resource, requestBody);
				responseBodyValidator(responseBody);
				
				break;
			}
			else
			{
				System.out.println("correct status code is not found in the iteration" +i);
			}
		}
		common_methods_utilities.evidenceFileCreator("Patch_TC1", requestBody, responseBody);
		Assert.assertEquals(responseStatuscode, 201);
	}
	
	public static void responseBodyValidator(String responseBody)
	{
		// create jsonPath object to extract response body parameters
				JsonPath jsp = new JsonPath(responseBody);

				// extract response body parameters
				String res_name = jsp.getString("name");
				String res_job = jsp.getString("job");
				//String res_updatedAt = jsp.getString("updatedAt");
				//String res_date = res_updatedAt.substring(0,10);
		

				//System.out.println("name : " + res_name + "\njob : " + res_job + "\nupdatedAt : " + res_date);

				// validate response body parameter
				Assert.assertEquals(res_name, "morpheus");
				Assert.assertEquals(res_job, "zion resident");

				// extract date from updatedAt parameter
				String current_date = LocalDate.now().toString();
				//Assert.assertEquals(res_date,current_date);
				System.out.println( "\nCurrent date : " +current_date);
				
	}

}


