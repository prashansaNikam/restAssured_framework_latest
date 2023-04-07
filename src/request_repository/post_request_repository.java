package request_repository;

public class post_request_repository {
	public static String baseuri()
	{
		String baseuri="https://reqres.in";
		return baseuri;
	}
	public static String resource()
	{
		String resource = "api/users";
		return resource;
	}
	public static String post_request_TC1()
	{
		String requestbody = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}" ;
		return requestbody;
	}
	public static String post_request_TC2()
	{
		String requestbody = "{\r\n"
				+ "    \"name\": \"prashansa\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}" ;
		return requestbody;
	}
}

