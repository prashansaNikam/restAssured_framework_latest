package common_methods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class common_methods_utilities {
	
	public static void evidenceFileCreator(String fileName, String request, String response) throws IOException {
		File newTextFile = new File(
				"C:\\Users\\HP\\Documents\\RestAssured" + fileName + ".txt");

		if (newTextFile.createNewFile()) {
			FileWriter dataWriter = new FileWriter(newTextFile);
			dataWriter.write("RequestBody is : \n " + request + "\n\n");
			dataWriter.write("ResponseBody is : \n" + response);
			dataWriter.close();
			System.out.println("Request and response body data saved in :" + newTextFile.getName());
		} else {
			System.out.println(newTextFile.getName() + " Already Exist please take a backup of it !");
		}
	}

}
