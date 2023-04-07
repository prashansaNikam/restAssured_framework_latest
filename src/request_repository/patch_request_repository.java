package request_repository;

public class patch_request_repository {
	public static String baseuri()
	{
		String baseuri="https://reqres.in/";
		return baseuri;
	}
	public static String resource()
	{
		String resource = "api/users/2";
		return resource;
	}
	public static String patch_request_tc1()
	{
        String requestbody = "{\r\n"
     		+ "	   \"name\":\"morpheus\",\r\n"
     		+ "		\"job\": \"zion resident\"\r\n"
     		+  "}" ;
     		
     			return requestbody;
   }
}
